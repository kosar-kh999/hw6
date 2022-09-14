package ir.maktab.view;


import ir.maktab.model.entity.Football;
import ir.maktab.model.entity.VolleyBall;
import ir.maktab.service.FootballImp;
import ir.maktab.service.LeagueFootball;
import ir.maktab.service.LeagueVolleyBall;
import ir.maktab.service.VolleyBallImp;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static LeagueVolleyBall leagueVolleyBall  = new VolleyBallImp();
    public static LeagueFootball leagueFootball = new FootballImp();
    private static Football football;
    private static VolleyBall volleyBall;
    public static void main(String[] args) throws SQLException {

        System.out.println("Press 1 --> FootBall");
        System.out.println("Press 2 --> VolleyBall");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1 :
                System.out.println("Press 1 --> Add Team");
                System.out.println("Press 2 --> Delete Team");
                System.out.println("Press 3 --> Add Games");
                System.out.println("Press 4 --> Show Information");
                System.out.println("Press 5 --> Sort League");
                switch (choice){
                    case 1 :
                        System.out.println("Enter name : " );
                        football.setName(scanner.nextLine());
                        System.out.println("Enter location : ");
                        football.setLocation(scanner.nextLine());
                        leagueFootball.addTeam(football);
                        break;
                    case 2:
                        System.out.println("The last team is out . ");
                        leagueFootball.deleteTeam(football.getPoints());
                        break;
                    case 3:

                        leagueFootball.countPlays();
                        break;
                    case 4 :
                        leagueFootball.showInformationTeam();
                        break;
                    case 5 :
                        leagueFootball.leagueSort();
                        break;
                }
            case 2 :
                System.out.println("Press 1 --> Add Team");
                System.out.println("Press 2 --> Delete Team");
                System.out.println("Press 3 --> Add Games");
                System.out.println("Press 4 --> Show Information");
                System.out.println("Press 5 --> Sort League");
                switch (choice) {
                    case 1:
                        System.out.println("Enter name : " );
                        volleyBall.setName(scanner.nextLine());
                        System.out.println("Enter location : ");
                        volleyBall.setLocation(scanner.nextLine());
                        leagueVolleyBall.addTeam(volleyBall);
                        break;
                    case 2:
                        System.out.println("The last team is out .");
                        leagueVolleyBall.deleteTeam(volleyBall.getPoints());
                        break;
                    case 3:
                        leagueVolleyBall.countPlays();
                        break;
                    case 4:
                        leagueVolleyBall.showInformation();
                        break;
                    case 5:
                        leagueVolleyBall.leagueSort();
                        break;
                }
        }

    }
    public int resultFootballGame(Football team1 ,Football team2){

        int points1 = team1.getPoints();
        int points2 = team2.getPoints();

        if (team1.getGoalsReceived() < team1.getGoalsSoccer()) {
            team2.setPoints(points1 + 3);
        }
        else if (team2.getGoalsReceived() < team2.getGoalsSoccer()){
            team2.setPoints(points2 + 3);
        }
        else {
            team1.setPoints(points1 + 1 );
            team2.setPoints(points2 + 1);
        }
        return (points1);
    }

    public int resultVolleyBallGame(VolleyBall team1,VolleyBall team2) {

        int points1 = team1.getPoints();
        int points2 = team2.getPoints();
        System.out.println("Enter the number of set of first team : ");
        int setTeam1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of set second team");
        int setTeam2 = Integer.parseInt(scanner.nextLine());
        if ((0 <= setTeam1 && 3 >= setTeam1) && (0 <= setTeam2 && 3 >= setTeam2)) {
            if (setTeam1 == 3) {
                if (setTeam2 == 0 && setTeam2 == 1) {
                    team1.setPoints(points1 + 3);
                    team2.setPoints(points2);
                } else if (setTeam2 == 2) {
                    team1.setPoints(points1 + 2);
                    team2.setPoints(points2 + 1);
                }
            }
            if (setTeam2 == 3) {
                if (setTeam1 == 0 && setTeam1 == 1) {
                    team2.setPoints(points2 + 3);
                    team1.setPoints(points1);
                } else if (setTeam1 == 2) {
                    team2.setPoints(points2 + 2);
                    team1.setPoints(points1 + 1);
                }
            }

        }
        return (points1);
    }
}
