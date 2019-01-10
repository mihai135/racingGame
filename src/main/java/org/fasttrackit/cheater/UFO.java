package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class UFO extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Accelerating as UFO");
        System.out.println(getName() + "has accelerated with " + speed + " km/h for "
                + durationInHours);
        double traveledDistance = 2 * speed * durationInHours;
        System.out.println(traveledDistance);
        return traveledDistance;

    }
}
