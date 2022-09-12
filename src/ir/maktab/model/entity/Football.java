package ir.maktab.model.entity;

import java.util.*;

public class Football extends SportClub{

    public Football(String name, String location, int wins, int draws, int defeats, int points, int numberOfPlayed) {
        super(name, location, wins, draws, defeats, points, numberOfPlayed);
    }

    public Football(int id, String name, String location, int wins, int draws, int defeats, int points,
                    int numberOfPlayed) {
        super(id, name, location, wins, draws, defeats, points, numberOfPlayed);
    }

}
