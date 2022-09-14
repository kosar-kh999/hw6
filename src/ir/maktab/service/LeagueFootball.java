package ir.maktab.service;

import ir.maktab.model.entity.Football;

import java.sql.SQLException;
import java.util.List;


public interface LeagueFootball {

    int addTeam(Football football) throws SQLException;

    void deleteTeam(int points) throws SQLException;

    public List<Football> showInformationTeam() throws SQLException;

    public List<Football> leagueSort() throws SQLException;

    public int countPlays() throws SQLException;

    public List<Football> updateTeam(Football football) throws SQLException;

}
