package ClassificaSerieA;

public class Main {
    public static void main(String[] args){
        Squadra Juventus = new Squadra(1, "Juventus FC");

        Juventus.addGiocatore(new Giocatore(1, "gigi", "buffon"));

        Giocatore g1 = new Giocatore(2, "cristiano", "ronaldo");
        Juventus.addGiocatore(g1);

        Squadra Milan = new Squadra(2, "Milano");
        Squadra Inter = new Squadra(1, "Internazionale");

        Classifica newClassifica = new Classifica(3);
        newClassifica.addSquadra(Juventus);
        newClassifica.addSquadra(Milan);
        newClassifica.addSquadra(Inter);

        newClassifica.esitoPartita(Juventus, 3, Milan, 3);
        newClassifica.esitoPartita(Inter, 1, Juventus, 0);
        newClassifica.esitoPartita(Milan, 0, Inter, 2);

        newClassifica.getClassifica();
    }
}
