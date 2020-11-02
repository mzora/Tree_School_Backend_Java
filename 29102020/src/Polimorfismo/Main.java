package Polimorfismo;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
        Person persona = new Person("Mario","Rossi");

        Student studente1 = new Student("Mario", "Rossi", "555");
        Student studente2 = new Student( "Carlo", "Verdi","333");
        Student studente3 = new Student("Matricola","Duplicata","555");

        Prof professore1 = new Prof("Mario","Rossi", "id1");
        Prof professore2 = new Prof("Giovanni","Bianchi", "id2");

        String test = "test";

        System.out.println(studente1.equals(studente1)); /* equals è riflessiva */
        System.out.println(!studente1.equals(null)); /* l'istanza di Studente NON è null */
        System.out.println(!studente1.equals(test)); /* l'istanza di Studente NON è della stessa classe dell'istanza di String */
        System.out.println(!studente1.equals(studente2)); /* i due studenti hanno matricola differente */
        System.out.println(studente1.equals(studente3)); /* i due studenti hanno la stessa matricola => quindi sono uguali! */

        System.out.println(!professore1.equals(persona)); /* l'istanza di Professore NON è della stessa classe dell'istanza di Persona */
        System.out.println(!professore1.equals(professore2)); /* i due professori hanno id differente */
        System.out.println(professore1.hashCode() != professore2.hashCode()); /* i due professori hanno id differente => viene generato un hashcode differente per le due istanze */
    }
}
class Person{
    private String nome;
    private String cognome;
    public Person(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
    }
}

class Student extends Person{
    private String matricola;
    public Student(String n, String c, String m){
        super(n,c);
        this.matricola=m;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//stessa reference
        if (o == null || getClass() != o.getClass()) return false;//non null, e stessa classe
        Student student = (Student) o;//cast esplicito di obj
        //return matricola.equals(student.matricola);
        //return (matricola!=null && student.matricola !=null && matricola.equals(student.matricola))
        return Objects.equals(matricola, student.matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricola);
    }
}

class Prof extends Person{
    private String idProf;
    public Prof(String n, String c, String id){
        super(n,c);
        this.idProf=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prof prof = (Prof) o;
        return Objects.equals(idProf, prof.idProf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProf);
    }

}

