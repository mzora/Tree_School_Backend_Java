package DistributoreBevande;

public class Main {
    public static void main(String[] args){
    TestDistributore();
    }

    public static void TestDistributore(){
        Caffe caffe = new Caffe("caffe", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        Distributore distributoreDiBevande = new Distributore(10);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println("task 1");
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);

        System.out.println("task 2");
        System.out.println(distributoreDiBevande.getResto() == 0);

        System.out.println("task 3");
        distributoreDiBevande.inserisciImporto(0.4);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);

        System.out.println("task 4");
        distributoreDiBevande.inserisciImporto(0.2);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);

        System.out.println("task 5");
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);

        System.out.println("task 6");
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);

        System.out.println("task 7");
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);

        System.out.println("task 8");
        distributoreDiBevande.inserisciImporto(2.0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);

        System.out.println("task 9");
        System.out.println(distributoreDiBevande.scegliProdotto("cappuccino") != null);

        System.out.println("task 10");
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);

        System.out.println("task 11");
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);

        System.out.println("task 12");
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
    }
}
