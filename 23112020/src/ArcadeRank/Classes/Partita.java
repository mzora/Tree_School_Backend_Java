package ArcadeRank.Classes;

import java.util.UUID;

public class Partita {
    Player player;
    VideoGame game;
    int score;
    UUID id;

    public Partita(Player player, VideoGame game, int score) {
        this.player = player;
        this.game = game;
        this.score = score;
        this.id = UUID.randomUUID();
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Partita{" +
                "player=" + player.username +
                ", game=" + game.Title +
                ", score=" + score +
                '}';
    }
}
