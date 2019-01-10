package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount;

    private String name;
    private String color;
    private double mileage;

    public Vehicle() {
        vehicleCount++;
    }

    public double accelerate(double speed, double durationInHours){
        System.out.println(name + "has accelerated with " + speed + " km/h for "
        + durationInHours);
        double traveledDistance = speed * durationInHours;
        return traveledDistance;
    }

//example of method overloading
    public double accelerate (double speed){
        return accelerate(speed, 1);
    }

    protected Vehicle clone(){
        Vehicle vehicle = new Vehicle();
        //copy properties from curent object
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
