package com.tomlloyd;

public class Vehicle {
    private String type;
    private int speed;

    public Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }
}
