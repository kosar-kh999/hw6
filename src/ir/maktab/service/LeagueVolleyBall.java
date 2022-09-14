package ir.maktab.service;

import ir.maktab.model.entity.VolleyBall;

import java.sql.SQLException;
import java.util.List;

public interface LeagueVolleyBall {

    int addTeam(VolleyBall volleyBall) throws SQLException;

    public void deleteTeam(int points) throws SQLException;

    public int countPlays() throws SQLException;

    public List<VolleyBall> showInformation() throws SQLException;

    public List<VolleyBall> leagueSort() throws SQLException;

    public List<VolleyBall> updateTeam(VolleyBall volleyBall) throws SQLException;
}
