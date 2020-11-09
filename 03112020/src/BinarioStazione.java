public class BinarioStazione extends Binario {
    private int idStazione;

    public BinarioStazione(int idStazione,Binario b){
        super(b);
        this.idStazione=idStazione;
    }

    @Override
    Binario percorri(Treno t){
        t.EntrareInStazione(this.idStazione);
        return super.percorri(t);
    }
}
