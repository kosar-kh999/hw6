package ir.maktab.service;

import ir.maktab.model.entity.Football;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public interface League {

    public int addTeam(Football football) ;

    List <Football> football = new ArrayList<>();
}
