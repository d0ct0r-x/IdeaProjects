package com.tomlloyd;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println();

        AudiA1 audi = new AudiA1("Audi A1", 8);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
        System.out.println();

        Ford ford = new Ford("Ford", 8);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println();
    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car.startEngine(): Engine started";
    }

    public String accelerate() {
        return "Car.accelerate(): Accelerating...";
    }

    public String brake() {
        return "Car.brake(): Braking...";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

class AudiA1 extends Car {

    public AudiA1(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine(): Engine started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate(): Accelerating...";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake(): Braking...";
    }
}
