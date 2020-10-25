public class Colore {
    private int r;
    private int g;
    private int b;

    public static final Colore Bianco = new Colore(true);
    public static final Colore Nero = new Colore(false);

    private Colore(boolean bianco){
        if(bianco){
            this.r = 255;
            this.g = 255;
            this.b =255;
        }else{
            this.r = 0;
            this.g = 0;
            this.b =0;
        }
    }

    public Colore(int r, int g, int b) throws Exception{
        if(valueVerifier(r))
            this.r = r;
        if(valueVerifier(g))
            this.g = g;
        if(valueVerifier(b))
            this.b = b;
    }

    private boolean valueVerifier(int v) throws Exception {
        if(v>=0 && v<=255)
            return true;
        throw new Exception(v+" is not a valid value, type values between 0-255");
    }
    public String toString(){
        return "r:"+this.r+" g:"+this.g+" b:"+this.b;
    }
}
