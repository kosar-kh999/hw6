package ir.maktab.service;

import ir.maktab.model.entity.Football;
import ir.maktab.model.repository.FootballRepository;

import java.sql.SQLException;
import java.util.List;

public class FootballImp implements League{

    private FootballRepository footballRepository = new FootballRepository();

    @Override
    public int addTeam(Football football) throws SQLException {
        return footballRepository.insertTeam(football);
    }

    @Override
    public void deleteTeam(int points) throws SQLException {
        deleteTeam(points);
    }

    @Override
    public List<Football> showInformationTeam() throws SQLException {
        return footballRepository.showInformation();
    }

    @Override
    public List<Football> leagueSort() throws SQLException {
        return footballRepository.leagueSort();
    }
}
