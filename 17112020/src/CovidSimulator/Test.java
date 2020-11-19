package CovidSimulator;

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
        //int processors = Runtime.getRuntime().availableProcessors();
        //System.out.println(processors);

        List<File> files = new ArrayList<>();
        //ArrayList<String> listaStringhe = new ArrayList<>();

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("/Users/mariozora/IdeaProjects/Tree_School_Backend_Java/17112020/src/CovidSimulator/files"))) {
            for(Path path : stream){
/*                try(BufferedReader br = Files.newBufferedReader(path)){
                    while(br.ready()){
                        String line = br.readLine();
                        listaStringhe.add(line);
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }*/

                if(!Files.isDirectory(path)){
                    files.add(path.toFile());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
