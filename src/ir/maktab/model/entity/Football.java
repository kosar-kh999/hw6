package ir.maktab.model.entity;


public class Football extends SportClub{

    public Football(int id, String name, String location, int wins, int draws, int defeats, int points,
                    int numberOfPlayed) {
        super(id, name, location, wins, draws, defeats, points, numberOfPlayed);
    }

    public Football(String name, int wins, int draws, int defeats, int points, int numberOfPlayed) {
        super(name, wins, draws, defeats, points, numberOfPlayed);
    }
}
