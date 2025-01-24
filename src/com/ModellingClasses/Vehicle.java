package com.ModellingClasses;

public class Vehicle {

    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public String getDescription() {
        return null;
    }

}


class Truck extends Vehicle {
    private final double payloadCapacity;


    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }


    public double getPayloadCapacity() {
        return payloadCapacity;
    }

}
