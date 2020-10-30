package GestoreVeicoli;

public class Autocarro extends Veicolo{
    private int capMaxCarico;

    public Autocarro(String targa, int cap){
        this.Targa=targa;
        this.capMaxCarico=cap;
    }

    public String toString(){
        return this.Targa+" : "+this.capMaxCarico;
    }
}
