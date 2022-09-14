package ir.maktab.service;

import ir.maktab.model.entity.VolleyBall;
import ir.maktab.model.repository.VolleyBallRepository;

import java.sql.SQLException;
import java.util.List;

public class VolleyBallImp implements LeagueVolleyBallImp {

    VolleyBallRepository volleyBallRepository = new VolleyBallRepository();

    @Override
    public int addTeam(VolleyBall volleyBall) throws SQLException {
        return volleyBallRepository.insertTeam(volleyBall);
    }

    @Override
    public void deleteTeam(int points) throws SQLException {
        volleyBallRepository.deleteTeam(points);
    }

    @Override
    public int countPlays() throws SQLException {
        return volleyBallRepository.countPlays();
    }

    @Override
    public List<VolleyBall> showInformation() throws SQLException {
        return volleyBallRepository.showInformation();
    }
}
