package com.victor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 11.11.2018.
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>(exits);
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        // rather than return exits object directly, we create a new HashMap object
        // that contains all the elements of exits and return than
        // so there's no chance of changing out internal map
        return new HashMap<>(exits);
    }

}
