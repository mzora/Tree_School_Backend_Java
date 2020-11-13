package Facebook;

public class Test {
        /*
       Aggiungere un utente
       Modificare nome e cognome di un utente
       Ottenere i post fatti da un utente
       TODO
        Mantenere la lista degli amici di un utente
        Aggiungere e rimuovere amici ad un utente
        Ottenere gli ultimi 3 utenti che si sono registrati
        Ottenere i post commentati da un utente
       */
    public static void main(String[] args) {
        Facebook face = new Facebook();
        User mario = new User("mario", "rossi");
        User carla = new User("carla","gialli");
        User luigi = new User("luigi","verdi");

        face.addUser(mario);
        face.addUser(carla);
        face.addUser(luigi);
        mario.setNome("marioBros");
        luigi.setNome("luigiBros");

        mario.addFriend(luigi);


        Post primoPostMario = new Post("ecco il primo post di mario",mario);
        face.addPost(primoPostMario);

        Post primoPostCarla = new Post("ecco post di carla",carla);
        face.addPost(primoPostCarla);

        Post secondoPostMario = new Post("secondo post di mario",mario);
        face.addPost(secondoPostMario);

        primoPostMario.addOrRemoveLike(luigi);
        primoPostMario.addOrRemoveLike(carla);
        primoPostMario.addOrRemoveLike(luigi);//luigi lo toglie

        primoPostMario.addComment(luigi);
        primoPostMario.addComment(luigi);
        primoPostMario.addComment(carla);
        primoPostMario.addComment(mario);

        primoPostMario.removeComment(luigi);

    }
}
