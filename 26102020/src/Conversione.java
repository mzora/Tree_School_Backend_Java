public enum Conversione {
        I(1),V(5),X(10),L(50),C(100),D(500),M(1000);

    private int valore;
    Conversione(int valore){
        this.valore = valore;
    }
    public int toInt(){
        return valore;
    }
}
