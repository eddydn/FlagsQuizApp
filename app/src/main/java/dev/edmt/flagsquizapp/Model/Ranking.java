package dev.edmt.flagsquizapp.Model;

/**
 * Created by reale on 30/09/2016.
 */

public class Ranking {
    private int Id;
    private double Score;

    public Ranking(int id, double score) {
        Id = id;
        Score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }
}
