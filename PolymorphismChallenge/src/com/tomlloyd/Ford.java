package com.tomlloyd;

class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford.startEngine(): Engine started";
    }

    @Override
    public String accelerate() {
        return "Ford.accelerate(): Accelerating...";
    }

    @Override
    public String brake() {
        return "Ford.brake(): Braking...";
    }
}
