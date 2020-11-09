public class Passeggero {
    private int codiceBiglietto;
    private String nome;
    protected int idVagone;
    protected CondizionePasseggero condizione;
    private int idStazioneArrivo;

    public Passeggero(int codBiglietto){
        this.codiceBiglietto=codBiglietto;
    }

    public Passeggero(int codBiglietto, String nome, int idvagone, int idSA){
        this.codiceBiglietto=codBiglietto;
        this.nome=nome;
        this.idVagone=idvagone;
        this.condizione = CondizionePasseggero.SEMPLICE;
        this.idStazioneArrivo=idSA;
    }

    public int getCodice() {
        return codiceBiglietto;
    }

    public int getIdVagone(){
        return this.idVagone;
    }

    public int getIdStazioneArrivo() {
        return idStazioneArrivo;
    }
}
