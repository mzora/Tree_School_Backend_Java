package CivilRegistry;

public class Main {
    public static void main(String[] args) {

        Anagrafe anagrafe = Anagrafe.getAnagrafe();

        Person p1= new Person("mario","rossi",55,"rssmra65a28c665j","Torino");
        Person p2= new Person("carlo","verdi",45,"crlvrd75a28c665j","Milano");
        Person p3= new Person("luisa","gialli",35,"rssmra85a28c665j","Roma");
        Person p4= new Person("luisa","rarara",25,"rrrmra95a28c665j","Torino");

        anagrafe.addPersona(p1);
        anagrafe.addPersona(p2);
        anagrafe.addPersona(p3);
        anagrafe.addPersona(p4);

        anagrafe.getAllPersons();
        System.out.println("");
        anagrafe.remPersona("rssmra65a28c665j");
        anagrafe.getAllPersons();
        System.out.println("");

        System.out.println("le luisa");
        anagrafe.getPersonFromName("luisa");
        System.out.println("");

        System.out.println("ora i piu anziani");

        anagrafe.addPersona(p1);
        anagrafe.getOldestPersons();
        System.out.println("");

        System.out.println("ora le citta dove sono presenti luisa");
        anagrafe.getAddressFromName("luisa");



    }
}
