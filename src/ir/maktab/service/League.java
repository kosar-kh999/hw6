package ir.maktab.service;

import ir.maktab.model.entity.Football;

import java.sql.SQLException;
import java.util.List;


public interface League {

    int addTeam(Football football) throws SQLException;

    void deleteTeam(int points) throws SQLException;

    public List<Football> showInformationTeam() throws SQLException;

    public List<Football> leagueSort() throws SQLException;

}
