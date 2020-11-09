public class VagoneLetto extends Vagone {
    private int lettiOccupati;

    public VagoneLetto(int cod) {
        super(cod);
        lettiOccupati=0;
    }

    @Override
    boolean AddRemPasseggero(Passeggero p, boolean sale){
        if(sale && passeggeri.size() < capienzaMax && p.getIdVagone()==this.idVagone && p.condizione==CondizionePasseggero.ASSONNATO){
            passeggeri.add(p);
            System.out.println("passeggero salito");
            lettiOccupati++;
            return true;
        }else if(!sale){
            passeggeri.remove(p);
            System.out.println("passeggero sceso");
            lettiOccupati--;
            return true;
        }
        System.out.println("condizione mancante per salire");
        return false;
    }
}
