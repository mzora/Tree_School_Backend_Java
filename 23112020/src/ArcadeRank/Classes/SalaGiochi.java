package ArcadeRank.Classes;

import netscape.javascript.JSObject;

import java.util.*;
import java.util.stream.Collectors;

/*l piazzamento di un utente nella classifica globale è dato dalla somma
     del suo piazzamento in ciascun videogioco moltiplicato per il coefficiente
      di difficoltà del videogioco. Se l'utente non ha giocato ad un videogioco x,
       il suo punteggio per x è 0.*/

public class SalaGiochi {
    TreeMap<VideoGame, Player> classifica;
    TreeSet<Player> players;
    HashSet<VideoGame> games;
    LinkedList<Partita> partite;

    private static SalaGiochi instance = null;
    public SalaGiochi() {
        this.classifica = new TreeMap<>();
        this.players=new TreeSet<>();
        this.games=new HashSet<>();
        this.partite=new LinkedList<>();
    }
    public static SalaGiochi getSalagiochi(){
        if(instance==null){
            instance=new SalaGiochi();
        }
        return instance;
    }

    public UUID addPlayer(String username){
        Player player = new Player(username);
        players.add(player);
        return player.id;
    }

    public UUID addGame(String title, int diff){
        VideoGame game =new VideoGame(title,diff);
        games.add(game);
        return game.id;
    }

    public void newPartita(Player player, VideoGame game,int score){
        partite.addFirst(new Partita(player,game, score));
    }

    public void classificaVideogame(VideoGame game){

        List<Partita>classifica = partite.stream()
                .filter(partita->partita.game.equals(game))
                .sorted(Comparator.comparingInt(Partita::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
        classifica.forEach(System.out::println);
    }

}
