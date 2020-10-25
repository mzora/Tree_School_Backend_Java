public class Quadrato {
    private int lato;
    private Colore colore;
    private int  perimetro = 4*lato;

    public Quadrato(int l){
        this.lato = l;
        this.colore = Colore.Nero;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void stampaQuadrato(){
        for(int i=0;i<lato;i++){
            for(int j=0; j<lato;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public Colore getColore(){
        return this.colore;
    }

    public void setColore(int r, int g, int b){
        try{
            this.colore = new Colore(r,g,b);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
