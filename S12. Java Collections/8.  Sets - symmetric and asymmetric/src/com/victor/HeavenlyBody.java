package com.victor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by dev on 13.11.2018.
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon (HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode called");
        return this.name.hashCode() + 57;
    }
}
/**
 * When overriding the equals() method in the HeavenlyBody class, we
 * were careful to make sure that it would not return true if a HeavenlyBody
 * was compared to a subclass of itself.
 *
 * We did that to demonstrate that method, but it was actually
 * unnecessary in the HeavenlyBody class.
 *
 * The mini challenge is just a question: why was it unnecessary?
 *
 * Hint: If you are stuck, check out Lecture 97
 *
 * Answer:
 *
 * The HeavenlyBody class is declared final, so cannot be subclassed.
 * The Java String class is also final, which is why it can safely
 * use the instanceof method without having to worry about
 * comparisons with a subclass.

 *
 **/