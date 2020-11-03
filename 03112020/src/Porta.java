public class Porta {
    private Integer codice;
    private StatoPorte statoPorta;

    public Porta(int cod) {
        this.codice = cod;
        this.statoPorta = StatoPorte.CHIUSE;
    }

    Integer getCodice(){
        return this.codice;
    }
    void apri() {
        this.statoPorta = StatoPorte.APERTE;
    }

    void chiudi() {
        this.statoPorta = StatoPorte.CHIUSE;
    }

    StatoPorte getStato() {
        return this.statoPorta;
    }

    void setStatoGuasta(){
        this.statoPorta = StatoPorte.GUASTE;
    }

}