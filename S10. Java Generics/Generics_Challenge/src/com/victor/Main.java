package com.victor;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Player> teams;
        // Collections.sort(teams);

        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        Team<FootballPlayer> real = new Team<>("Real Madrid");
        Team<FootballPlayer> juv = new Team<>("Juventus");
        Team<FootballPlayer> mu = new Team<>("Manchester");
        Team<BasketballPlayer> basket = new Team<>("LAkers");


        League<Team<FootballPlayer>> footballLeague = new League<>("UEFA");

        footballLeague.addTeam(real);
        footballLeague.addTeam(juv);
        footballLeague.addTeam(mu);

        // footballLeague.addTeam(basket);

        real.matchResult(juv,2,0);
        real.matchResult(mu,0,1);
        mu.matchResult(juv,2,3);



        footballLeague.standings();






    }
}