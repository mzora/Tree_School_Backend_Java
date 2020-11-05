public class Passeggero {
    private int codice;
    private String nome;
    protected int idVagone;

    public Passeggero(int cod){
        this.codice=cod;
    }

    public Passeggero(int cod, String nome, int idvagone){
        this.codice=cod;
        this.nome=nome;
        this.idVagone=idvagone;
    }

    public int getCodice() {
        return codice;
    }

    public int getIdVagone(){
        return this.idVagone;
    }
}
