package ir.maktab.service;

import ir.maktab.model.entity.Football;
import ir.maktab.model.entity.VolleyBall;

import java.sql.SQLException;

public interface LeagueVolleyBallImp {

    int addTeam(VolleyBall volleyBall) throws SQLException;

    public void deleteTeam(int points) throws SQLException;
}
