package CovidSimulator;

import javax.imageio.ImageIO;
import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Test {
    private static Stack<String> idTamponi;
    public static void main(String[] args) {
        //int processors = Runtime.getRuntime().availableProcessors();System.out.println(processors);

        //testCovidCatcher();
        //testCovidCatcher_V2();
        }

    public static void testCovidCatcher(){
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
        }finally {
            try {
                long sum = 0;
                for (CovidCatcher thread : listaThreads) {
                    sum += thread.counter;
                }
                System.out.println(sum);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis() - startTime);
        }
    }
    public static void testCovidCatcher_V2(){
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

        List<CovidCatcher_V2> listaThreads = new ArrayList<>();

        idTamponi = new Stack<>();
        for (File file : files) {
            listaThreads.add(new CovidCatcher_V2(file, idTamponi));
        }
        for (CovidCatcher_V2 thread : listaThreads) {
            thread.start();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")))
        {
            while(listaThreads.get(0).isAlive() || listaThreads.get(1).isAlive() || listaThreads.get(2).isAlive()) {
                while(!idTamponi.empty())
                    bw.write(idTamponi.pop() + '\n');
            }
            while(!idTamponi.empty())
                bw.write(idTamponi.pop() + '\n');


            long sum = 0;
            for (CovidCatcher_V2 thread : listaThreads) {
                sum += thread.counter;
            }
            System.out.println(sum);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
    public static void testCovidCatcher_V3(){
        idTamponi = new Stack<>();
        CovidCatcher_V3 nord = new CovidCatcher_V3("files\\nord.txt", idTamponi);
        CovidCatcher_V3 centro = new CovidCatcher_V3("files\\centro.txt", idTamponi);
        CovidCatcher_V3 sud = new CovidCatcher_V3("files\\sud.txt", idTamponi);

        nord.start();
        centro.start();
        sud.start();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")))
        {
            while(nord.isAlive() || centro.isAlive() || sud.isAlive())
            {
                while(!idTamponi.empty())
                    bw.write(idTamponi.pop() + '\n');
            }

            while(!idTamponi.empty())
                bw.write(idTamponi.pop() + '\n');
        }

        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
