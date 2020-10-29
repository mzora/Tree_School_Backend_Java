import java.util.Arrays;

public class ListaOrdinata {
    private int counter=0;
    private int[] lista;

    public ListaOrdinata(){
        this.lista = new int[20];
    }

    public int[] getLista(){
        return this.lista;
    }

    public void insert(int n){
        lista[counter] = n;
        counter++;
        this.lista = new int[counter];
        //array azzerata
        Arrays.sort(lista);
    }

    public int indexOf(int x){
        int indice;
        int inizio;int fine;int centro;
        inizio=0;
        fine=lista.length-1;
        indice=-1;
        while(indice==-1 && inizio<=fine){
            centro = (inizio+fine)/2;
            if(lista[centro]==x)
                indice=centro;
            else
            if(x>lista[centro])
                inizio = centro +1;
            else
                fine = centro-1;
        }
        return indice;
    }

    public void remove(int x){
        int indice = indexOf(x);
        for(int j = indice; j< lista.length;j++){
            lista[j] = lista[j+1];
        }
        /*
        for(int i=0;i<lista.length;i++){
            if(lista[i]==x){
                //a partire da questo punto i numeri devono scalare
                //e ciclo la lista a partire da questo punto in avanti
                for(int j = i; j< lista.length;j++){
                    lista[j] = lista[j+1];
                }
            }
        }
        */
        counter--;
    }
}
