public class Contatore {
    private int conteggio;

    public Contatore() {
    }

    public Contatore(int valoreIniziale) {
        this.conteggio = valoreIniziale;
    }

    public void IncrementaContatore() {
        this.conteggio++;
    }

    public int getConteggio() {
        return conteggio;
    }

    public void resetConteggio() {
        this.conteggio = 0;
    }

    public void setConteggio(int nuovoValore) {
        this.conteggio = nuovoValore;
    }
}
