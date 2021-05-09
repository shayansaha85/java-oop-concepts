package com.inheritance;

class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering @ " + currentDirection + " degrees");
    }
    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move() : Moving @ " +  currentVelocity + " in " + currentDirection);
    }
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop() {
        this.currentVelocity = 0;
    }
}

class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear() : Changed to " + currentGear);
    }
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity = "+speed+" | Direction = "+direction);
        move(speed, direction);
    }
}

class Ford extends Car {
    private int roadServiceMonths;
    public Ford(int roadServiceMonths) {
        super("Ford", "4 wheeler", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelarate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity==0) {
            stop();
            changeGear(1);
        } else if(newVelocity>0 && newVelocity<=10){
            changeGear(1);
        } else if(newVelocity>10 && newVelocity<=20) {
            changeGear(2);
        } else if(newVelocity>20 && newVelocity<=30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVelocity>0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
        System.out.println("Ford.accelarate() : New Velocity = " + newVelocity);
    }
}

class Testing {
    public static void main(String[] args) {
        Ford ford = new Ford(36);
        ford.steer(45);
        ford.accelarate(30);
        System.out.println();
        ford.accelarate(20);
    }
}