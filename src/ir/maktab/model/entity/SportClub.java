package ir.maktab.model.entity;

import java.util.Objects;

public abstract class SportClub {

    int id;

    String typeOfSport;
    String name;
    String location;
    int wins;
    int draws;
    int defeats;
    int points;
    int numberOfPlayed;

    public SportClub(String name, String location, int wins, int defeats, int points,
                     int numberOfPlayed) {
        this.name = name;
        this.location = location;
        this.wins = wins;
        this.defeats = defeats;
        this.points = points;
        this.numberOfPlayed = numberOfPlayed;
    }

    public SportClub(int id, String typeOfSport,String name, String location, int wins, int draws, int defeats,
                     int points, int numberOfPlayed) {
        this.id = id;
        this.typeOfSport = typeOfSport;
        this.name = name;
        this.location = location;
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
        this.points = points;
        this.numberOfPlayed = numberOfPlayed;
    }

    public SportClub(String name, int wins, int draws, int defeats, int points, int numberOfPlayed) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
        this.points = points;
        this.numberOfPlayed = numberOfPlayed;
    }

    public SportClub(String name, int wins, int defeats, int points, int numberOfPlayed) {
        this.name = name;
        this.wins = wins;
        this.defeats = defeats;
        this.points = points;
        this.numberOfPlayed = numberOfPlayed;
    }

    public SportClub(int id, String name, String location, int wins, int draws, int defeats, int points
            , int numberOfPlayed) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
        this.points = points;
        this.numberOfPlayed = numberOfPlayed;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNumberOfPlayed() {
        return numberOfPlayed;
    }

    public void setNumberOfPlayed(int numberOfPlayed) {
        this.numberOfPlayed = numberOfPlayed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportClub sportClub = (SportClub) o;
        return id == sportClub.id && wins == sportClub.wins && draws == sportClub.draws && defeats == sportClub.defeats && points == sportClub.points && numberOfPlayed == sportClub.numberOfPlayed && Objects.equals(typeOfSport, sportClub.typeOfSport) && Objects.equals(name, sportClub.name) && Objects.equals(location, sportClub.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeOfSport, name, location, wins, draws, defeats, points, numberOfPlayed);
    }

    @Override
    public String toString() {
        return "SportClub{" +
                "id=" + id +
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
