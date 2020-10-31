package DistributoreBevande;

public class Prodotto {

    private String codice;
    private double prezzo;

    public Prodotto(String codP, double prezzo){
        this.codice = codP;
        this.prezzo=prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
