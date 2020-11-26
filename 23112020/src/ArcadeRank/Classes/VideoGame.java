package ArcadeRank.Classes;

import java.util.TreeSet;
import java.util.UUID;

public class VideoGame {
    UUID id;
    int difficulty;//1-5
    TreeSet<Player> classifica;
    String Title;

    public VideoGame(String title, int diff) {
        this.id = UUID.randomUUID();
        this.difficulty = diff;
        this.classifica = new TreeSet<>();
    }

    public UUID getId() {
        return id;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getTitle() {
        return Title;
    }

    public TreeSet<Player> getClassifica() {
        return classifica;
    }

    public void setClassifica(TreeSet<Player> classifica) {
        this.classifica = classifica;
    }

}
