package ir.maktab.model.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Football extends SportClub{

    public class ClubComparator implements Comparator<Football> {

        @Override
        public int compare(Football team1, Football team2) {
            return Integer.valueOf(team1.points).compareTo(Integer.valueOf(team2.points))  ;
        }
    }

    void setArray(ArrayList<Football> football){
        for (Football person : football) {
            System.out.println(person.getName());
        }
        Collections.sort(football,new ClubComparator());
        for (Football person : football) {
            System.out.println(person.getName());
        }
    }
}
