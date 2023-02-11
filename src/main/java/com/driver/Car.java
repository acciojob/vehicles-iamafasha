package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.seats = seats;
        this.currentGear =1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getDoors(){
        return this.doors;
    }

    public int getGears(){
        return this.gears;
    }

     public int getWheels(){
        return this.wheels;
     }

     public boolean isManual(){
        return this.isManual;
     }

     public int getSeats(){
        return this.seats;
     }

     public int getCurrentGear(){
        return this.currentGear;
     }

     public String getType(){
        return this.type;
     }
}
