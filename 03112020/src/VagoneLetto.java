public class VagoneLetto extends Vagone {
    private int lettiOccupati=passeggeri.size();
    public VagoneLetto(int cod) {
        super(cod);
        lettiOccupati=0;
    }
}
