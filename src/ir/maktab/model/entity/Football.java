package ir.maktab.model.entity;

import java.util.*;

public class Football extends SportClub{
     private List <Football > footballs ;

    public Football(String name, String location, int wins, int draws, int defeats, int points, int numberOfPlayed) {
        super(name, location, wins, draws, defeats, points, numberOfPlayed);
    }

    public Football(int id, String name, String location, int wins, int draws, int defeats, int points, int numberOfPlayed) {
        super(id, name, location, wins, draws, defeats, points, numberOfPlayed);
    }

    public List<Football> getFootballs() {
        return footballs;
    }

    public void setFootballs(List<Football> footballs) {
        this.footballs = footballs;
    }

    @Override
    public String toString() {
        return "Football{" +
                "footballs=" + footballs +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", wins=" + wins +
                ", draws=" + draws +
                ", defeats=" + defeats +
                ", points=" + points +
                ", numberOfPlayed=" + numberOfPlayed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Football football = (Football) o;
        return Objects.equals(footballs, football.footballs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(footballs);
    }
}
