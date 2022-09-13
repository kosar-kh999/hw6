package ir.maktab.model.repository;

import ir.maktab.config.ApplicationConstant;
import ir.maktab.model.entity.Football;
import ir.maktab.model.entity.VolleyBall;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VolleyBallRepository {

    public int insertTeam(VolleyBall volleyBall) throws SQLException {

        String sql = "insert into football_tbl  (name,location,wins,defeats,points,numberOfPlayed)values " +
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
}
