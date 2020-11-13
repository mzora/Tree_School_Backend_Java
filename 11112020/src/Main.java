import TinderLike.Interesse;
import TinderLike.TinderApp;
import TinderLike.Utente;

public class Main {
    /*
    - inserire un utente e i suoi interessi
    - cancellare un utente (e i suoi interessi associati)
    - dato un utente u1, ottenere l'utente u2 con più interessi in comune con u1
    - TODO PLUS :ottenere gli utenti più simili (ossia con più interessi in comune)
    */
    public static void main(String[] args) {
        Interesse sport= new Interesse(001,"sport");
        Interesse cucina= new Interesse(002,"cucina");
        Interesse viaggi= new Interesse(003,"viaggi");
        Interesse arte= new Interesse(004,"arte");
        Interesse games = new Interesse(005,"games");
        Interesse filantropia = new Interesse(006,"filantropia");


        Utente u1 = new Utente("gianni",cucina);
        //u1.addInteresse(cucina);

        Utente u2 = new Utente("carla",viaggi);
        u2.addInteresse(arte);
        u2.addInteresse(sport);

        Utente u3 = new Utente("paolo",null);
        Utente u4 = new Utente("gianni",sport);


        TinderApp App = new TinderApp();
        App.addUtente(u1);
        App.addUtente(u2);
        App.addUtente(u3);
        //App.addUtente(u4);

        App.addInterestToUser(u3,filantropia);
        App.addInterestToUser(u3,viaggi);
        App.addInterestToUser(u3,arte);

        System.out.println(u1.equals(u4));
        System.out.println(u1.hashCode());
        System.out.println(u4.hashCode());

        App.getLista().forEach((key,value)-> System.out.println(key.getNome()+" : "+value.toString()));

        System.out.println(u1.getNome()+" matches "+App.findMatch(u1).getNome());
        System.out.println(u2.getNome()+" matches "+App.findMatch(u2).getNome());
    }
}
