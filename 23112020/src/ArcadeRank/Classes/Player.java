package ArcadeRank.Classes;

import java.util.UUID;

public class Player {
    UUID id;
    String username;

    Player(String username) {
        this.id = id;
        this.username=username;
    }
    public UUID getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

}
