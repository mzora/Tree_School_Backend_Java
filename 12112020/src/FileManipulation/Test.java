package FileManipulation;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {

        List<File> files = new ArrayList<>();
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("/Users/mariozora/IdeaProjects/Tree_School_Backend_Java/12112020/src/FileManipulation"))){

            for(Path path : stream){
                if(!Files.isDirectory(path)){
                    files.add(path.toFile());
                }
            }
        }catch (IOException e){

        }
        //File origin = files.get(2);
        //File destination = files.get(0);

        Path originPath = Paths.get("/Users/mariozora/IdeaProjects/Tree_School_Backend_Java/12112020/src/FileManipulation/Righe.txt");
        Path destPath = Paths.get("/Users/mariozora/IdeaProjects/Tree_School_Backend_Java/12112020/src/FileManipulation/righeInverse.txt");

        List<String> content = Files.readAllLines(originPath);
        Collections.reverse(content);

        for(String s : content){
            s+=System.lineSeparator();
            try{
                Files.write(destPath,s.getBytes(),StandardOpenOption.APPEND);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        Path origRighe2 = Paths.get("Users","mariozora","IdeaProjects","Tree_School_Backend_Java","12112020","src","FileManipulation","Righe2");
        ArrayList<String> listaStringhe = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(origRighe2)){
            while(br.ready()){
                String line = br.readLine();
                listaStringhe.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        Map<String,List> mappedContent = new HashMap<>();
        for (String s : listaStringhe){
            List<String> words = new ArrayList<>();
            String[] splitted = s.split(":");
            //TODO 757e5ec3, rimuovere "," inizio e fine stringa
            for(int i=1; i< splitted.length;i++){
                splitted[i] = splitted[i].replaceAll("[\\.\\?\\;]","");
                splitted[i] = splitted[i].replaceAll(","," ");
                splitted[i] = splitted[i].replaceAll(" {2}"," ");
                splitted[i] = splitted[i].replaceAll(" ",",");
                words.add(splitted[i]);
            }
            mappedContent.put(splitted[0],words);
        }
        mappedContent.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}