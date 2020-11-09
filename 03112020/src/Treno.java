import java.util.ArrayList;

public class Treno {
    protected int codice;
    protected int velocitaAttuale;
    protected int nMaxVagoni;
    //protected boolean statoPorteVagoni;//T:aperte; F:chiuse; null:guaste
    //protected StatoPorte statoPorteVagoni;
    protected int nPasseggeri;
    protected int nMaxPasseggeri;

    protected ArrayList<Vagone> vagoni= new ArrayList<Vagone>();
    protected boolean fermoInStazione;
    protected int idStazioneAttuale;

    public Treno(int cod){
        this.codice=cod;
        this.velocitaAttuale=0;
        //this.statoPorteVagoni=StatoPorte.CHIUSE;
        this.nPasseggeri=0;
        this.fermoInStazione=true;
    }
    void Partire(){
        this.fermoInStazione=false;
        this.velocitaAttuale=50;
    }
    void Frenare(){
        this.velocitaAttuale=0;
    }

    /*void ApriChiudiPorte(boolean guaste){
        if(!guaste){
            if(statoPorteVagoni)
                statoPorteVagoni=false;
            else{
                statoPorteVagoni=true;
            }
        }
    }*/
    /*    void ApriChiudiPorte(boolean guaste){
            if(!guaste){
                if(this.statoPorteVagoni== StatoPorte.APERTE)
                    statoPorteVagoni=StatoPorte.CHIUSE;
                else{
                    statoPorteVagoni=StatoPorte.APERTE;
                }
            }else{
                this.statoPorteVagoni=StatoPorte.GUASTE;
            }
        }*/

    void EntrareInStazione(int idStazione){
        Frenare();
        this.fermoInStazione=true;
        this.idStazioneAttuale=idStazione;
        //this.statoPorteVagoni=StatoPorte.APERTE;

        for (Vagone vagone : vagoni) {
            for (Passeggero passeggero : vagone.passeggeri) {
                if(passeggero.getIdStazioneArrivo()==this.idStazioneAttuale){
                    vagone.AddRemPasseggero(passeggero,false);
                }
            }
        }

    }
    void PasseggeroScende(){
        if(this.nPasseggeri>0)
            this.nPasseggeri--;
    }
    void PasseggeroSale(){
        if(this.nPasseggeri<nMaxPasseggeri)
            this.nPasseggeri++;
    }

    void addVagone(Vagone v){
        if(this.fermoInStazione && vagoni.size()<nMaxVagoni) {
            this.vagoni.add(v);
            System.out.println("vagone aggiunto");
        }
        else{
            System.out.println("Condizione mancante per aggiungere il vagone");
        }
    }

    void remVagone(Vagone v) {
        if (!vagoni.isEmpty() && v.passeggeri.isEmpty()) {
            vagoni.remove(v);
            System.out.println("vagone rimosso");
        }else{
            System.out.println("condizione mancante");
        }
    }

    void setIdStazioneAttuale(int idStazione){
        this.idStazioneAttuale=idStazione;
    }
}
