import java.util.ArrayList;

public class Vagone {
    private int codice;
    protected final int capienzaMax=100;
    protected int nPasseggeriABordo;
    protected ArrayList<Porta> porte = new ArrayList<Porta>();
    protected ArrayList<Passeggero> passeggeri= new ArrayList<Passeggero>();

    public Vagone(int cod){
        this.codice=cod;
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

    void addPasseggero(Passeggero p){
        if(passeggeri.size()<capienzaMax)
            passeggeri.add(p);
        else {
            System.out.println("Raggiunta capienza max di questo vagone");
        }
    }
}
