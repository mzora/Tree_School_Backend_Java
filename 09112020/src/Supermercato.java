import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Supermercato {

    private Queue<Cliente> coda = new PriorityQueue<>();

    public Supermercato(){
    }

    public void addClienteInCoda(Cliente c){
        coda.add(c);
    }

    public Cliente removeClienteDallaCoda(){
        return coda.poll();
    }

    public Cliente prossimoCliente(){
        return coda.peek();
    }

    public String clientiInCoda(){
        return coda.toString();
    }
}
