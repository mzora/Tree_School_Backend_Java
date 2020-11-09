public class TrenoRegionale extends Treno{
    public TrenoRegionale(int cod) {
        super(cod);
        this.nMaxVagoni=15;
    }

    void addVagone(Vagone v){
        if(this.fermoInStazione && vagoni.size()<nMaxVagoni && v instanceof VagonePasseggero) {
            this.vagoni.add(v);
            System.out.println("vagone aggiunto");
        }
        else{
            System.out.println("Condizione mancante per aggiungere il vagone");
        }
    }
}
