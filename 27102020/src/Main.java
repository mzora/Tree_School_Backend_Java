import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //TestBiblioteca();
        TestListOrdinata();
    }

    public static void TestBiblioteca(){
        int[] values = new int[7];
        values[0] = 123;
        values[1] = 4;
        values[2] = 98;
        values[3] = 33;
        values[4] = 76;
        values[5] = 2;
        values[6] = 235;
        Biblioteca biblioteca = new Biblioteca(values);
        System.out.println(biblioteca.esisteLibro(76));
        int[] libriOrdinati = biblioteca.getIndiciLibriOrdinati();
        System.out.println(libriOrdinati[0] == 2);
        System.out.println(libriOrdinati[1] == 4);
        System.out.println(libriOrdinati[2] == 33);
        System.out.println(libriOrdinati[3] == 76);
        System.out.println(libriOrdinati[4] == 98);
        System.out.println(libriOrdinati[5] == 123);
        System.out.println(libriOrdinati[6] == 235);

    }

    public static void TestListOrdinata(){
        ListaOrdinata newList = new ListaOrdinata();
        newList.insert(150);
        newList.insert(40);
        newList.insert(90);

        //System.out.println(newList.indexOf(40));
        //newList.remove(40);
        System.out.println(Arrays.toString(newList.getLista()));
    }
}
