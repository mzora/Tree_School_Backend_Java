import java.util.ArrayList;
import java.util.Scanner;

public class VagoneRistorante extends Vagone {
    private ArrayList<Tavolo> tavoli;
    private int copertiAttuali;
    private int counterTavoli;

    public VagoneRistorante(int cod) {
        super(cod);
        tavoli=new ArrayList<>();
        copertiAttuali=0;
        counterTavoli=0;
    }

    void addTavolo(Tavolo t, int coperti){
        if(copertiAttuali<passeggeri.size() && counterTavoli<25){
            tavoli.add(t);
            counterTavoli++;
            for(int i=0;i<coperti;i++)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Codice passeggero: ");
                int a = (int)sc.nextInt();
                t.addPersonaAlTavolo(new Passeggero(a));
                copertiAttuali++;
            }
        }
    }

    void remTavolo(Tavolo t){
        copertiAttuali -= (4-t.getPostiDisponibili());
        tavoli.remove(t);
        counterTavoli--;
    }
}
