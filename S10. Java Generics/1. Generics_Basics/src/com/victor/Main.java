package com.victor;
/**
 * Created by Victor on 2018-10-29
 */
public class Main {

    public static void main(String[] args) {

        FootbalPlayer joe = new FootbalPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Backham");

        Team<FootbalPlayer> adelaide = new Team<>("Adelaide");
        adelaide.addPlayer(joe);

        System.out.println(adelaide.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Team B");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<>("Team C");
        soccerTeam.addPlayer(beckham);

        Team<FootbalPlayer> melbourne = new Team<>("Melbourne");
        FootbalPlayer gordon = new FootbalPlayer("Gordon");
        melbourne.addPlayer(gordon);

        Team<FootbalPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootbalPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaide,3,8);

        adelaide.matchResult(fremantle,2,1);
        //adelaide.matchResult(baseballTeam,3,8);

        System.out.println("Rankings");
        System.out.println(adelaide.getName() + ": " + adelaide.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaide.compareTo(melbourne));
        System.out.println(adelaide.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaide));
        System.out.println(melbourne.compareTo(fremantle));
    }
}
