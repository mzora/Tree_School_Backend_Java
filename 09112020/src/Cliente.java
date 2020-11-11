import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Cliente implements Comparable<Cliente>{
    private String nome;
    private String cognome;
    private int eta;
    private UUID id;

    public Cliente(String n, String c, int e){
        this.cognome=c;
        this.nome=n;
        this.eta=e;
        this.id=UUID.randomUUID();
    }
    public int getEta() {
        return eta;
    }
    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null || getClass()!=obj.getClass())return false;
        Cliente cliente =(Cliente) obj;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //per ottenere l'ordine dei clienti
    @Override
    public int compareTo(Cliente o) {
        return Comparator.comparing((Cliente c)->c.getEta()).reversed().thenComparing(Cliente::getId).compare(this,o);
        //return -Integer.compare(this.eta, c.getEta());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
