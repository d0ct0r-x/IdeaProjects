package com.tomlloyd;

public class Car extends Vehicle {

    private String make;
    private String direction;
    private int gear;

    public Car(int speed, String make, String direction, int gear) {
        super("Car", speed);
        this.make = make;
        this.direction = direction;
        this.gear = gear;
    }

    public void resetCar() {
        
    }

    public String getMake() {
        return make;
    }

    public String getDirection() {
        return direction;
    }

    public int getGear() {
        return gear;
    }
}
