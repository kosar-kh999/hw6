package ir.maktab.model.repository;

import ir.maktab.config.ApplicationConstant;
import ir.maktab.model.entity.Football;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FootballRepository {

    public int insertTeam(Football football) throws SQLException {

        String sql = "insert into football_tbl  (name,location,wins,draws,defeats,points,numberOfPlayed)values " +
                " (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        preparedStatement.setString(1,football.getName() );
        preparedStatement.setString(2,football.getLocation());
        preparedStatement.setInt(3,football.getWins() );
        preparedStatement.setInt(4,football.getDraws() );
        preparedStatement.setInt(5,football.getDefeats() );
        preparedStatement.setInt(6, football.getPoints());
        preparedStatement.setInt(7, football.getNumberOfPlayed());
        return preparedStatement.executeUpdate();
    }

    public void deleteTeam(int points) throws SQLException {

        String sql = "DELETE FROM football_tbl WHERE MIN(points)  ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        preparedStatement.executeUpdate();
    }

    public void countPlays() throws SQLException {

        String sql = "SELECT count(numberOfPlayed)FROM football_tbl ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
    }

    public List<Football> showInformation() throws SQLException {

        String sql = "Select * from football_tbl ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        List<Football> footballs = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Football football = new Football(resultSet.getInt(1),
                    resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4),
                    resultSet.getInt(5), resultSet.getInt(6), resultSet.getInt(7),
                    resultSet.getInt(8));
            footballs.add(football);
        }
        return footballs;
    }

    public void LeagueSort() throws SQLException {

        String sql = "Select * from football_tbl ORDER BY points";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
    }

}
