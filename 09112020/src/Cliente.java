public class Cliente implements Comparable<Cliente>{
    private String nome;
    private String cognome;
    private int eta;
    private int id;


    public Cliente(String n, String c, int e, int id){
        this.cognome=c;
        this.nome=n;
        this.eta=e;
        this.id=id;
    }
    public int getEta() {
        return eta;
    }

    //per ottenere l'ordine dei clienti
    @Override
    public int compareTo(Cliente c) {
        return -Integer.compare(this.eta, c.getEta());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
