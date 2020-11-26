package CivilRegistry;

import java.util.ArrayList;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String nome;
    private String cognome;
    private int eta;
    private String cf;
    private String indirizzo;
    private ArrayList<Person> prole;

    public Person(String nome, String cognome, int eta, String cf, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.cf = cf;
        this.indirizzo = indirizzo;
        this.prole= new ArrayList<>();
    }

    public void addFiglio(Person p){
        prole.add(p);
    }

    public ArrayList<Person> getFigli(){
        return this.prole;
    }

    public String getCf() {
        return cf;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(cf, person.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", cf='" + cf + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return -Integer.compare(eta,p.eta);
    }
}
