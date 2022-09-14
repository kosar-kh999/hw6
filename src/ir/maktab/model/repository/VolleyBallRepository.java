package ir.maktab.model.repository;

import ir.maktab.config.ApplicationConstant;
import ir.maktab.model.entity.Football;
import ir.maktab.model.entity.VolleyBall;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VolleyBallRepository {

    public int insertTeam(VolleyBall volleyBall) throws SQLException {

        String sql = "insert into volleyBall_tbl  (name,location)values " +
                " (?,?)";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        preparedStatement.setString(1,volleyBall.getName() );
        preparedStatement.setString(2,volleyBall.getLocation());;
        return preparedStatement.executeUpdate();
    }

    public int deleteTeam(int points) throws SQLException {

        String sql = "DELETE FROM volleyBall_tbl WHERE MIN(points)  ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        return preparedStatement.executeUpdate();
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

    public List<VolleyBall> showInformation() throws SQLException {

        String sql = "Select * from volleyBall_tbl ";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        List<VolleyBall> volleyBalls = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            VolleyBall volleyBall = new VolleyBall(resultSet.getString(1),
                    resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4),
                    resultSet.getInt(5),resultSet.getInt(6),resultSet.getInt(7));
            volleyBalls.add(volleyBall);
        }
        return volleyBalls;
    }

    public List<VolleyBall> leagueSort() throws SQLException {

        String sql = "Select * from volleyBall_tbl ORDER BY points";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        List<VolleyBall> volleyBalls = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            VolleyBall volleyBall = new VolleyBall(resultSet.getString(1),
                    resultSet.getInt(2), resultSet.getInt(3),
                    resultSet.getInt(4), resultSet.getInt(5),resultSet.getInt(6));
            volleyBalls.add(volleyBall);
        }
        return volleyBalls;
    }

    public List<VolleyBall> updateTeam(VolleyBall volleyBall) throws SQLException {

        String sql = "UPDATE volleyBall_tbl SET wins = ? ,defeats = ?,points = ?,numberOfPlayed = ?,set = ?";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, volleyBall.getWins());
        preparedStatement.setInt(2, volleyBall.getDefeats());
        preparedStatement.setInt(3, volleyBall.getPoints());
        preparedStatement.setInt(4, volleyBall.getNumberOfPlayed());
        preparedStatement.setInt(5, volleyBall.getSet());
        List<VolleyBall> volleyBalls = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            VolleyBall volleyBallTeam = new VolleyBall(resultSet.getString(1),
                    resultSet.getInt(2), resultSet.getInt(3), resultSet.getInt(4),
                    resultSet.getInt(5), resultSet.getInt(6));
            volleyBalls.add(volleyBallTeam);
        }
        return volleyBalls;
    }
}
