import java.util.ArrayList;

public class VagoneRistorante extends Vagone {
    private ArrayList<Tavolo> tavoli;

    public VagoneRistorante(int cod, int capMax) {
        super(cod, capMax);
        tavoli=new ArrayList<>();
    }

    void addTavolo(Tavolo t){
        //aggiungere tavolo tenendo conto della capienza del vagone capmax
        tavoli.add(t);

    }
}
