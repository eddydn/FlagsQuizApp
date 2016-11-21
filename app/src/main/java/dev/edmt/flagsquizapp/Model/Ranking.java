package dev.edmt.flagsquizapp.Model;

/**
 * Created by reale on 30/09/2016.
 */

public class Ranking {
    private int Id;
    private int Score;

    public Ranking(int id, int score) {
        Id = id;
        Score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
