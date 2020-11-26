package CivilRegistry;

public class Main {
    public static void main(String[] args) {

        Anagrafe anagrafe = Anagrafe.getAnagrafe();

        Person p1= new Person("mario","rossi",55,"rssmra65a28c665j","Torino");
        Person p2= new Person("carlo","verdi",45,"crlvrd75a28c665j","Milano");
        Person p3= new Person("luisa","gialli",35,"rssmra85a28c665j","Roma");
        Person p4= new Person("luisa","rarara",25,"rrrmra95a28c665j","Torino");
        Person p5= new Person("gigi","romano",10,"rmnlgu10a28c665j","Roma");
        Person p6= new Person("luca","magalli",15,"mgllcu05a28c665j","Torino");

        anagrafe.addPersona(p1);
        anagrafe.addPersona(p2);
        anagrafe.addPersona(p3);
        anagrafe.addPersona(p4);
        anagrafe.addPersona(p5);
        anagrafe.addPersona(p6);

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
        System.out.println("");

        System.out.println("ora i figli delle luisa");
        p3.addFiglio(p5);
        p4.addFiglio(p6);

        anagrafe.getFigliFromParentName("luisa");
    }
}
