public class Interruttore {
    private Lampadina lampadina;
    public Interruttore(Lampadina l){
        this.lampadina = l;
    }

    public boolean press(){
        return lampadina.click();
    }
}
