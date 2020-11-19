package CovidSimulator;

import javax.imageio.ImageIO;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        //int processors = Runtime.getRuntime().availableProcessors();System.out.println(processors);

        long startTime = System.currentTimeMillis();

        Path outputFilePath = Paths.get("/Users/mariozora/IdeaProjects/Tree_School_Backend_Java/17112020/src/CovidSimulator/output.txt");

        List<File> files = new ArrayList<>();
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("/Users/mariozora/IdeaProjects/Tree_School_Backend_Java/17112020/src/CovidSimulator/files"))) {
            for(Path path : stream){
                if(!Files.isDirectory(path)){
                    files.add(path.toFile());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        List<CovidCatcher> listaThreads = new ArrayList<>();

        for (File file : files) {
            listaThreads.add(new CovidCatcher(file, outputFilePath));
        }
        for (CovidCatcher thread : listaThreads) {
            thread.start();
        }
        try{
            for (CovidCatcher thread : listaThreads) {
                thread.join();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            try {
                long sum=0;
                for (CovidCatcher thread : listaThreads) {
                    sum+= thread.counter;
                }
                System.out.println(sum);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis() - startTime);
        }
    }
}
