package DistributoreBevande;

public class Distributore {

    private Prodotto[] prodotti;
    private double saldo;

    public Distributore(int slotProdottiDisponibili)
    {
        prodotti= new Prodotto[slotProdottiDisponibili];
        this.saldo=0;
    }

    public void caricaProdotto(Prodotto p){
        for(int i=0; i<prodotti.length; i++)
            if (prodotti[i] == null) {
                prodotti[i] = p;
                break;
            }
    }

    public void rimuoviProdotto(int indice) {
        for(int i=indice; i < prodotti.length-1; i++)
            prodotti[i] = prodotti[i+1];

        prodotti[prodotti.length-1] = null;
    }

    public void inserisciImporto(double monetaInserita){
        this.saldo+=monetaInserita;
    }

    public Prodotto scegliProdotto(String codP){
        Prodotto pTemp = null;
        for(int i=0; i < prodotti.length;i++){
            if(prodotti[i] != null && prodotti[i].getCodice().equals(codP)){
                if(saldo >= prodotti[i].getPrezzo()) {
                    saldo -= prodotti[i].getPrezzo();
                    pTemp = prodotti[i];
                    rimuoviProdotto(i);
                    break;
                }
            }
        }
        return pTemp;
    }

    public double saldoAttuale(){
        return saldo;
    }

    public double getResto(){
        double restoOut = saldo;
        saldo=0;
        return restoOut;
    }

}
