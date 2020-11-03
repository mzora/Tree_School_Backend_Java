public class TrenoRegionale extends Treno{
    public TrenoRegionale(int cod) {
        super(cod);
        this.nMaxVagoni=15;
    }

    void addVagone(VagonePasseggero v){
        if(this.fermoInStazione)
            this.vagoni.add(v);
    }
}
