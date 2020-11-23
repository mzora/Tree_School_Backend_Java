package GutenbergAnalyzer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Analyzer implements Runnable{
    private String fileName;
    private int[]output;

    public Analyzer(String input){
        this.fileName=input;
        this.output=new int[25];
    }
    @Override
    public void run() {
        try{
            InputStream inputStream = new FileInputStream(fileName);
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                charsCounter(line);
            }
        }catch(IOException ioe){

        }
    }

    private void charsCounter(String line){
        //ASCII AZ 65-90 ;az 97-122
        for(int i=0;i<line.length();i++){
            int asciiNumber = line.charAt(i);
            if((asciiNumber>64 && asciiNumber<91)){
                this.output[asciiNumber-65]++;
            }
            if((asciiNumber>96 && asciiNumber<123)){
                this.output[asciiNumber-97]++;
            }
        }
    }
    public String getFileName() {
        return fileName;
    }
    public int[] getOutput() {
        return output;
    }
}
