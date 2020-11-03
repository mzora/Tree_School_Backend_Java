import java.util.ArrayList;

public class Tavolo {
    private int codice;
    private final int capienzaTavolo =4;
    private ArrayList<Passeggero> personeAlTavolo;
    public Tavolo(int codice){
        this.codice=codice;
        personeAlTavolo =new ArrayList<>();
    }

    int getPostiDisponibili(){
        return this.capienzaTavolo-personeAlTavolo.size();
    }

    void addPersonaAlTavolo(Passeggero p){
        if(personeAlTavolo.size()<capienzaTavolo) {
            personeAlTavolo.add(p);
            System.out.println("Passeggero " + p.getCodice() + " aggiunto");
        }
        else{
            System.out.println("tavolo completo");
        }
    }
}
