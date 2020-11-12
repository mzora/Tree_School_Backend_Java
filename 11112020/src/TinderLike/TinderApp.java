package TinderLike;
import java.util.*;

public class TinderApp {
    Map<Utente,HashSet<Interesse>> lista;

    public TinderApp(){
        this.lista= new HashMap<>();
    }

    public void addUtente(Utente utente){
        lista.put(utente,utente.getInterestedIn());
    }
}
