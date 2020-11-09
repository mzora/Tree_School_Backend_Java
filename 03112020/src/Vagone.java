import java.util.ArrayList;

public class Vagone {
    protected int idVagone;
    protected final int capienzaMax=100;
    protected int nPasseggeriABordo;
    protected ArrayList<Porta> porte = new ArrayList<Porta>();
    protected ArrayList<Passeggero> passeggeri= new ArrayList<Passeggero>();

    public Vagone(int cod){
        this.idVagone=cod;
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

    boolean AddRemPasseggero(Passeggero p, boolean sale){
        if(sale && passeggeri.size() < capienzaMax && p.getIdVagone()==this.idVagone){
            passeggeri.add(p);
            System.out.println("passeggero salito");
            return true;
        }else if(!sale){
            passeggeri.remove(p);
            System.out.println("passeggero sceso");
            return true;
        }
        System.out.println("condizione mancante per salire");
        return false;
    }

    private class Porta {
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

    public enum StatoPorte {
        APERTE,CHIUSE,GUASTE;
    }

}
