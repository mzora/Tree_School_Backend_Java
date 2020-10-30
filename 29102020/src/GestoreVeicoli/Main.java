package GestoreVeicoli;

public class Main {
    public static void main(String[] args){
        Veicolo v1 = new Autocarro("CV755KE", 25);
        Veicolo v2 = new Automobile("FN287TR", 5);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
