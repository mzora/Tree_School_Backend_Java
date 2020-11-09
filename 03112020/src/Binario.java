public abstract class Binario {
    protected Binario nextBinario;

    public Binario(Binario successivo){
        this.nextBinario=successivo;
    }

    Binario getSuccessivo(){
        return this.nextBinario;
    }

    void setSuccessivo(Binario successivo){
        this.nextBinario=successivo;
    }

    Binario percorri(Treno t){
        System.out.println(t.getClass().getSimpleName()+" ----- " + this.getClass().getSimpleName());
        return getSuccessivo();
    }

}
