package ir.maktab.service;

import ir.maktab.model.entity.VolleyBall;
import ir.maktab.model.repository.VolleyBallRepository;

import java.sql.SQLException;

public class VolleyBallImp implements LeagueVolleyBallImp {

    VolleyBallRepository volleyBallRepository = new VolleyBallRepository();

    @Override
    public int addTeam(VolleyBall volleyBall) throws SQLException {
        return volleyBallRepository.insertTeam(volleyBall);
    }
}
