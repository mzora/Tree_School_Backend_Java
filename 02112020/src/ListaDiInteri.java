import java.util.Arrays;

public class ListaDiInteri implements Iterabile, Lista {
    Object[]elementi;//integer è una classe wrapper, di oggetti e puo essere null
    int count=0;
    int size=0;

    public ListaDiInteri() {
        elementi =new Object[0];
    }
    public ListaDiInteri(Integer[] elementi) {
        this.elementi=elementi;
    }
    @Override
    public Object next() {
        return elementi[count++];
    }
    @Override
    public boolean hasNext() {
        return count+1< elementi.length;
    }
    @Override
    public void reset() {
        count=0;
    }

    //new methods Lista************************
    @Override
    public void add(Object o) {
        elementi = Arrays.copyOf(elementi, elementi.length+1);
        elementi[count]=o;
        count++;
    }

    @Override
    public Object get(int i) {
        return elementi[i];
    }

    @Override
    public boolean contains(Object o) {
        for(int i =0; i< elementi.length-1;i++){
            if(elementi[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return elementi.length;
    }

    @Override
    public boolean remove(int i) {
        if(elementi[i]!=null && i < elementi.length){
            elementi[i]=null;
            for(int j=0;j< elementi.length;j++){
                if(elementi[j]==null){
                    elementi[j]=elementi[j+1];
                    elementi[j+1]=null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        //Arrays.fill(elementi, null);
        count=0;
        elementi= new Object[0];
    }
}