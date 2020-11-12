import TinderLike.Interesse;
import TinderLike.TinderApp;
import TinderLike.Utente;

public class Main {
    /*
    - inserire un utente e i suoi interessi
    - cancellare un utente (e i suoi interessi associati)
    - dato un utente u1, ottenere l'utente u2 con più interessi in comune con u1
    - PLUS :ottenere gli utenti più simili (ossia con più interessi in comune)
    */
    public static void main(String[] args) {
        Interesse sport= new Interesse(001,"descrizione sport");
        Interesse cucina= new Interesse(002,"descrizione cucina");
        Interesse viaggi= new Interesse(003,"descrizione viaggi");
        Interesse arte= new Interesse(004,"descrizione arte");

        Utente u1 = new Utente("gianni",sport);
        u1.addInteresse(cucina);

        Utente u2 = new Utente("carla",viaggi);
        u2.addInteresse(arte);
        u2.addInteresse(sport);

        Utente u3 = new Utente("paolo",null);

        TinderApp App = new TinderApp();
        App.addUtente(u1);
        App.addUtente(u2);
        App.addUtente(u3);
    }
}
