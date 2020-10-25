public class Cerchio {
    private double P = Math.PI;
    private int raggio;
    private Colore colore;

    private double circonferenza;
    private double area;

    public Cerchio(int r){
        this.raggio = r;
        this.circonferenza = 2*P*r;
        this.area =P*(r*r);
        this.colore = Colore.Nero;
    }
    public double getCirconferenza() {
        return this.circonferenza;
    }
    public double getArea() {
        return this.area;
    }

    public Colore getColore() {
        return colore;
    }
    public void setColore(int r, int g, int b) throws Exception {
        try{
            this.colore = new Colore(r,g,b);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
