package CivilRegistry;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrafe {
    private List<Person> persone;

    //Singleton Pattern
    private static Anagrafe instance = null;
    private Anagrafe() {
        this.persone=new ArrayList<>();
    }
    public static Anagrafe getAnagrafe() {
        if (instance == null) {
            instance = new Anagrafe();
        }
        return instance;
    }

    public void addPersona(Person p){
        persone.add(p);
    }

    public void remPersona(String cf){
        persone.removeIf(p->p.getCf().equals(cf));
    }

    public void getPersonFromName(String nome){
        persone.stream().filter(p->p.getNome().equals(nome)).forEach(person -> System.out.println(person.toString()));
    }

    public void getOldestPersons(){
        List<Person> limited =
        persone.stream().sorted().limit(3).collect(Collectors.toList());
        for (Person person : limited) {
            System.out.println(person);
        }
    }

    public void getAddressFromName(String nome){
        persone.stream().filter(p->p.getNome().equals(nome)).forEach(person -> System.out.println(person.getIndirizzo()));
    }

    public void getAllPersons(){
        for (Person person : persone) {
            System.out.println(person.toString());
        }
    }
}
