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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interesse interesse1 = (Interesse) o;
        return Objects.equals(testo, interesse1.testo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice);
    }

    @Override
    public int compareTo(Interesse o) {
        return Comparator.comparing(Interesse::getCodice).compare(this , o);
    }
}
