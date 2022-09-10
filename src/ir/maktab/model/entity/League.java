package ir.maktab.model.entity;

public interface League {

    public void addClub(String name , String location);
    public void deleteClub(String name , String location);
    public int addGameClub(int plays);
    public void showInformation( String club,String name, int plays, int wins, int draws,int defeats, int points,
                                 int matches);
    public void displayPremierLeague();
}
