package com.victor;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dev on 31.10.2018.
 */
// ArrayList<Player> league;
// Collections.sort(league);

// Create a generic class to implement a league table for a sport.
// The class should allow league to be added to the list, and store
// a list of league that belong to the league.
//
// Your class should have a method to print out the league in order,
// with the team at the top of the league printed first.
//
// Only league of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.
public class League<T extends Team>{
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        String name1 = name;
    }

    public boolean addTeam(T team) {
        if (this.league.contains(team)) {
            System.out.println(team.getName() + " is already in a league");
            return false;
        } else {
            System.out.println(team.getName() + " was added to league");
            league.add(team);
            return true;
        }
    }

    public void matchResults(League<T> opponent, int scored, int missed) {
        String message;
        if (scored > missed) {
            won++;
            message = " beat ";
        } else if (scored < missed) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponent != null) {
            opponent.matchResults(null,scored,missed);
        }

    }

    public void standings() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }

    }



}
