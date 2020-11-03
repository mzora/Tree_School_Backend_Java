import java.util.ArrayList;

public class Vagone {
    private int codice;
    protected int capienzaMax;
    protected int nPasseggeriABordo;
    protected ArrayList<Porta> porte = new ArrayList<>();
    protected ArrayList<Passeggero> passeggeri= new ArrayList<>();

    public Vagone(int cod, int capMax){
        this.codice=cod;
        this.capienzaMax=capMax;
        porte.add(new Porta(1));
        porte.add(new Porta(2));
    }

    void ApriPorte(){
        for(Porta p :porte){
            p.apri();
        }
    }
    void ChiudiPorte(){
        for(Porta p:porte){
            p.chiudi();
        }
    }
    void SetGuasta(int nPorta){
        for(Porta p :porte){
            if(p.equals(porte.get(nPorta)))
                p.setStatoGuasta();
        }
    }

}
