package ir.maktab.model.entity;

import java.util.Objects;

public class VolleyBall extends SportClub {

    private int set;

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public VolleyBall(String name, String location, int wins, int defeats, int points, int numberOfPlayed,int set) {
        super(name, location, wins, defeats, points, numberOfPlayed);
        this.set = set;
    }

    public VolleyBall(String name, int wins, int defeats, int points, int numberOfPlayed,int set) {
        super(name, wins, defeats, points, numberOfPlayed);
        this.set = set;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VolleyBall that = (VolleyBall) o;
        return set == that.set;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), set);
    }

    @Override
    public String toString() {
        return "VolleyBall{" +
                "set=" + set +
                ", id=" + id +
                ", typeOfSport='" + typeOfSport + '\'' +
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
