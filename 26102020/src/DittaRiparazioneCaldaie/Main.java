package DittaRiparazioneCaldaie;

public class Main {
    public static void main(String[] args){
        TestDittaRiparazioni();
    }

    public static void TestDittaRiparazioni(){
        DittaRiparazioni ditta = new DittaRiparazioni();
        ditta.addTecnico(5, "Zora");
        ditta.addTecnico(10,"Rossi");
        ditta.addTecnico(15,"Magalli");
        ditta.addTecnico(20,"Cherubini");

        ditta.setFerie("Zora", true);//;-D

        ditta.repairInsert("via del ridotto 5", 4);
        ditta.repairInsert("corso Grosseto 102", 10);
        ditta.repairInsert("corso Venezia 29", 3);

        ditta.getAllRiparazioni();
    }
}
