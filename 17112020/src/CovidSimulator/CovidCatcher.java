package CovidSimulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CovidCatcher extends Thread {
    private File inputFile;
    private Path outputFilePath;
    private ArrayList<String> list;
    private HashSet<Person> persone;
    public long counter=0;

    public CovidCatcher(File inputFile, Path outputFilePath){
        this.inputFile = inputFile;
        this.outputFilePath = outputFilePath;
        this.list = new ArrayList<String>();
        this.persone = new HashSet<>();
    }

    @Override
    public void run() {
        try {
            fromFileToList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String s : list) {
            persone.add(getPersonFromLista(s));
        }

        for (Person person : persone) {
            covidCatcher(person);
        }

        Iterator<Person> iterator = persone.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if(covidCatcher(person)){
                //writeToFile(person);
                counter++;
            }
        }
    }

    private void writeToFile(Person p){
        String toWrite=p.toString()+System.lineSeparator();
        try{
            Files.write(outputFilePath,toWrite.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void fromFileToList() throws FileNotFoundException {
        Scanner s = new Scanner(inputFile);
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
    }

    private Person getPersonFromLista(String s){
        String[] splitted= s.split(";");//flip split!!
        return new Person(UUID.fromString(splitted[0]), Float.parseFloat(splitted[1]), Integer.parseInt(splitted[2]),Boolean.parseBoolean(splitted[3]),Boolean.parseBoolean(splitted[4]),Boolean.parseBoolean(splitted[5]), Person.SituaClinica.valueOf(splitted[6]));
    }

    private boolean covidCatcher(Person p){
        if(p.getTemperature()>=40){
            return true;
        }else if(p.getTemperature()>=38 && p.isDebolezza() && p.isGusto() && p.isTosse()){
            return true;
        }else if(p.getCondizione()==Person.SituaClinica.CRITICA &&(p.getTemperature()>=38.5 || (p.isTosse()||p.isDebolezza()||p.isGusto()))){
            return true;
        }else if(p.getEta()>=50 && p.getTemperature()>=37){
            return true;
        }else if(p.getEta()>=60 &&((p.isGusto() && p.getCondizione()== Person.SituaClinica.CAUTELA)||(p.isTosse() && p.getCondizione()== Person.SituaClinica.CRITICA))){
            return true;
        }else{
            return false;
        }
    }
}
