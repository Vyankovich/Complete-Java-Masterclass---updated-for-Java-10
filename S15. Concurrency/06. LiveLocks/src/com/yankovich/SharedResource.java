package com.yankovich;

/**
 * Created by vyankovich on 2019-01-29
 */
public class SharedResource {
    private Worker owner;

    public SharedResource(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    public synchronized void setOwner(Worker worker) {
        this.owner = owner;
    }
}
