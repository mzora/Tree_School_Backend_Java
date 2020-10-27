import java.util.Arrays;

public class Biblioteca {
    private int nLibri;
    private int[] libri = new int[nLibri];

    //fare sorting nel costruttore
    public Biblioteca(int n){
        this.nLibri=n;
    }

    public Biblioteca(int[] arr){
        this.libri=arr;
        this.nLibri =arr.length;
    }

    //usare ricerca binaria
    public boolean esisteLibro(int indice) {
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == indice)
                return true;
        }
        return false;
    }

    public int[] getIndiciLibriOrdinati() {
        Arrays.sort(libri);
        return libri;
    }
}
