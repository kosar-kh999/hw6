package ir.maktab.model.entity;


import java.util.Objects;

public class Football extends SportClub{

    private int goalsReceived;

    private int goalsSoccer;

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = goalsReceived;
    }

    public int getGoalsSoccer() {
        return goalsSoccer;
    }

    public void setGoalsSoccer(int goalsSoccer) {
        this.goalsSoccer = goalsSoccer;
    }

    public Football(int id,String name, String location, int wins, int draws, int defeats, int points,
                    int numberOfPlayed,int goalsSoccer, int goalsReceived) {
        super(id,name, location, wins, draws, defeats, points, numberOfPlayed);
        this.goalsSoccer = goalsSoccer;
        this.goalsReceived = goalsReceived;
    }

    public Football(String name, int wins, int draws, int defeats, int points, int numberOfPlayed,int goalsSoccer,
                    int goalsReceived) {
        super(name, wins, draws, defeats, points, numberOfPlayed);
        this.goalsSoccer = goalsSoccer;
        this.goalsReceived = goalsReceived;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Football football = (Football) o;
        return goalsReceived == football.goalsReceived && goalsSoccer == football.goalsSoccer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(goalsReceived, goalsSoccer);
    }

    @Override
    public String toString() {
        return "Football{" +
                "goalsReceived=" + goalsReceived +
                ", goalsSoccer=" + goalsSoccer +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", wins=" + wins +
                ", draws=" + draws +
                ", defeats=" + defeats +
                ", points=" + points +
                ", numberOfPlayed=" + numberOfPlayed +
                '}';
    }
}
