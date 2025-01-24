package com.ModellingClasses;

public class Player {
    private String name;
    private String position;

    // Constructor
    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', position='" + position + "'}";
    }

}
