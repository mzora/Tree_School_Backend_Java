package GestoreVeicoli;

public class Automobile extends Veicolo{
    private int numPorte;

    public Automobile(String m, int n){
        this.Targa=m;
        this.numPorte=n;
    }
    public String toString(){
        return this.Targa+" : "+this.numPorte;
    }
}
