package org.fasttrackit;

//inheritance or "is-a" relationship

public class AutoVehicle extends Vehicle {

    boolean running;
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle() {
        //this.engine = new Engine();
        this (new Engine());
    }
}
