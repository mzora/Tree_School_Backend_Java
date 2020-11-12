package TinderLike;

import java.util.Comparator;
import java.util.Objects;

public class Interesse implements Comparable<Interesse>{
    private int codice;
    private String interesse;
    public Interesse(int codice,String interesse){
        this.codice=codice;
        this.interesse=interesse;
    }

    public int getCodice() {
        return codice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interesse interesse1 = (Interesse) o;
        return Objects.equals(interesse, interesse1.interesse);
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
