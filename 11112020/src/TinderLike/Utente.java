package TinderLike;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Utente {
    private UUID id;
    private String nome;
    private HashSet<Interesse> interestedIn;

    public Utente(String n, Interesse interesse){
        this.id=UUID.randomUUID();
        this.nome=n;
        this.interestedIn= new HashSet<>();
        if(interesse!= null)
            this.interestedIn.add(interesse);
    }

    public String getNome() {
        return nome;
    }

    public HashSet<Interesse> getInterestedIn() {
        return interestedIn;
    }

    public UUID getId() {
        return id;
    }

    public void addInteresse(Interesse interesse){
        this.interestedIn.add(interesse);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(id, utente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
