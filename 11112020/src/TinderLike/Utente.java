package TinderLike;

import java.util.HashSet;
import java.util.Set;

public class Utente {
    private String nome;
    private HashSet<Interesse> interestedIn;

    public Utente(String n, Interesse interesse){
        this.nome=n;
        interestedIn.add(interesse);
    }


    public String getNome() {
        return nome;
    }
    public HashSet<Interesse> getInterestedIn() {
        return interestedIn;
    }

    public void addInteresse(Interesse interesse){
        this.interestedIn.add(interesse);
    }

}
