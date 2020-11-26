package ArcadeRank;

import ArcadeRank.Classes.SalaGiochi;
import ArcadeRank.Classes.VideoGame;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        SalaGiochi sala = new SalaGiochi();
        UUID player_1= sala.addPlayer("player1");
        UUID player_2= sala.addPlayer("player2");

        VideoGame pacman = new VideoGame("pacman",2);

    }
}
