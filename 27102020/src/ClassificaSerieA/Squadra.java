package ClassificaSerieA;

public class Squadra {
    private int Id;
    private String nomeSquadra;
    private Giocatore[] rosaGiocatori;
    private int counterGiocatori=0;
    private int punteggio=0;
    private int golFatti=0;
    private int  golSubiti=0;

    public Squadra(int id, String nome){
        this.Id=id;
        this.nomeSquadra=nome;
        this.rosaGiocatori = new Giocatore[5];
    }
    public void addGiocatore(Giocatore g){
        if(counterGiocatori<rosaGiocatori.length){
            this.rosaGiocatori[counterGiocatori] = g;
            counterGiocatori++;
        }else{
            System.out.println("Squadra completa");
        }
    }

    public int getGolFatti() {
        return golFatti;
    }

    public void setGolFatti(int golFatti) {
        this.golFatti += golFatti;
    }

    public int getGolSubiti() {
        return golSubiti;
    }

    public void setGolSubiti(int golSubiti) {
        this.golSubiti += golSubiti;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio += punteggio;
    }

    public String getNomeSquadra() {
        return nomeSquadra;
    }

}
