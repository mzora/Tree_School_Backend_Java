public class VagonePasseggero extends Vagone{
    public VagonePasseggero(int cod, int capMax) {
        super(cod, capMax);
    }

    void AddRemPasseggero(Passeggero p, boolean sale){
        if(sale && passeggeri.size() < capienzaMax)
            passeggeri.add(p);
        passeggeri.remove(p);
    }
}
