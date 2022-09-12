package ir.maktab.model.repository;

import ir.maktab.config.ApplicationConstant;
import ir.maktab.model.entity.Football;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public void countPlays(int plays) throws SQLException {

        String sql = "SELECT count(numberOfPlayed)FROM football_tbl ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
    }
}
