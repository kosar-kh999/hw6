package ir.maktab.service;

import ir.maktab.model.entity.Football;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface League {

     int addTeam(Football football) throws SQLException;

    List <Football> football = new ArrayList<>();

     void deleteTeam(int points) throws SQLException;
}
