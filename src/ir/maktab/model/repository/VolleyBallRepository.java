package ir.maktab.model.repository;

import ir.maktab.config.ApplicationConstant;
import ir.maktab.model.entity.Football;
import ir.maktab.model.entity.VolleyBall;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VolleyBallRepository {

    public int insertTeam(VolleyBall volleyBall) throws SQLException {

        String sql = "insert into volleyBall_tbl  (name,location,wins,defeats,points,numberOfPlayed)values " +
                " (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        preparedStatement.setString(1,volleyBall.getName() );
        preparedStatement.setString(2,volleyBall.getLocation());
        preparedStatement.setInt(3,volleyBall.getWins() );
        preparedStatement.setInt(4,volleyBall.getDefeats() );
        preparedStatement.setInt(5, volleyBall.getPoints());
        preparedStatement.setInt(6, volleyBall.getNumberOfPlayed());
        return preparedStatement.executeUpdate();
    }

    public void deleteTeam(int points) throws SQLException {

        String sql = "DELETE FROM volleyBall_tbl WHERE MIN(points)  ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        preparedStatement.executeUpdate();
    }

    public int countPlays() throws SQLException {

        String sql = "SELECT count(numberOfPlayed)FROM volleyBall_tbl ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            return resultSet.getInt(7);
        }
        return 0;
    }
}
