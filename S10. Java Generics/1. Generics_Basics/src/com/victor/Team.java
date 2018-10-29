package com.victor;

import java.util.ArrayList;

/**
 * Created by Victor on 2018-10-29
 */
//<T> indicates that there's gonna be type parameter.
// And now it extends Player (restrict the type of class that we use for team
// public class Team<T extends Player> // can be like: <T extends Player & Coach & Manager>. In 'classes then interfaces' order
    // we've created the ability to have generic types
    // we specify generic type as a parameter to generic interface Comparable
    //  Comparable - takes the object, and return negative number if this is less then the object
    // zero if they're equal, and positive if this's greater then the object
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            // as now we have T extends Player, we don't need to cast ((Player) player).getName()
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

/*    public Player findPlayer(String name) {
        for (int i = 0; i < this.members.size(); i++) {
            Player existing = members.get(i);
            if (existing.getName().equals(name)) {
                return existing;
            }
        }
        return null;
    }*/

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }
}
