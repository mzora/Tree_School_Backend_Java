package Facebook;

public class Test {
        /*
       Aggiungere un utente
       Modificare nome e cognome di un utente
       Ottenere i post fatti da un utente
       Mantenere la lista degli amici di un utente
       Aggiungere e rimuovere amici ad un utente
       Ottenere i post commentati da un utente
        TODO
        Ottenere gli ultimi 3 utenti che si sono registrati
       */
    public static void main(String[] args) {
        Facebook face = new Facebook();

        face.signUP("mario","rossi");
        face.signUP("carla","gialli");
        face.signUP("luigi","verdi");


    }
}
