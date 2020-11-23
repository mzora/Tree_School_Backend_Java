package GutenbergAnalyzer;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    private static Stack<int[]> arr;
    public static TreeMap<String,int[]> booksMapping;//title, charsCount

    public static void main(String[] args) {
        //get files
        List<String> filesPath = new ArrayList<>();
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("17112020/src/GutenbergAnalyzer/books"))) {
            for(Path path : stream){
                if(!Files.isDirectory(path)){
                    filesPath.add(path.toString());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //prepare a list that will contain 58 threads to run
        List<Analyzer> listJobs = new ArrayList<>();

        //instantiate map
        booksMapping = new TreeMap<>();

        //instantiate jobs
        for (String filePath : filesPath) {
            listJobs.add(new Analyzer(filePath));
        }

        ExecutorService pool = Executors.newFixedThreadPool(7);

        //run job
        for (Analyzer job : listJobs) {
            pool.submit(job);//tutti i job in coda
        }
        //pool termina a termine esecuzione jobs
        pool.shutdown();

        try {
            //inchioda il main per ottenere la risposta del pool
            pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        //ora sono disponibili i risultati dei job
        for (Analyzer job : listJobs) {
            int[] arr = job.getOutput();
            booksMapping.put(job.getFileName(), job.getOutput());
        }

        booksMapping.forEach((k,v)-> System.out.println(k+" "+Arrays.toString(v)));
    }
}
