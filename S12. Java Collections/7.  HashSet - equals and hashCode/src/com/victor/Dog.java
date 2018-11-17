package com.victor;

/**
 * Created by dev on 17.11.2018.
 */
public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
// to ensure that equals can't be overridden we mark it as final
    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if (obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }
}
