import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Cliente c1= new Cliente("mario", "rossi",33);
        Cliente c2= new Cliente("carlo", "gialli",78);
        Cliente c3= new Cliente("paola", "verdi",45);

        SupermercatoTreeSet mercato = new SupermercatoTreeSet();

        mercato.addClienteInCoda(c1);
        mercato.addClienteInCoda(c2);
        mercato.addClienteInCoda(c3);

        for(int i =-1;i<= mercato.clientiInCoda();i++){
            System.out.println("\nclienti in coda: "+ mercato.clientiInCoda());

            System.out.println("prox cliente"+mercato.prossimoCliente());
            Cliente cliente = mercato.removeClienteDallaCoda();
            System.out.println("cliente rimosso:"+ cliente.toString());
        }

    }
}
