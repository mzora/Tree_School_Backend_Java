package TinderLike;

import java.util.Comparator;
import java.util.Objects;

public class Interesse implements Comparable<Interesse>{
    private int codice;
    private String testo;
    public Interesse(int codice,String testo){
        this.codice=codice;
        this.testo=testo;
    }

    public int getCodice() {
        return codice;
    }

    @Override
    public int compareTo(Interesse o) {
        return Comparator.comparing(Interesse::getCodice).compare(this , o);
    }

    @Override
    public String toString() {
        return testo;
    }
}
