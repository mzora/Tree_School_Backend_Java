import java.util.TreeSet;

public class SupermercatoTreeSet{
    public TreeSet<Cliente> coda;

    public SupermercatoTreeSet(){
        coda=new TreeSet();
    }

    public boolean addClienteInCoda(Cliente c) {
        return coda.add(c); /*O(log n)*/
    }

    public Cliente removeClienteDallaCoda() {
        return coda.pollFirst(); /*O(1)*/
    }

    public Cliente prossimoCliente() {
        return coda.first(); /*O(1)*/
    }

    public int clientiInCoda() {
        return coda.size(); /*O(1)*/
    }
}
