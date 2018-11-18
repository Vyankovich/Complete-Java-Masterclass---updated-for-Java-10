package com.victor;

/**
 * Created by dev on 18.11.2018.
 */
public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
