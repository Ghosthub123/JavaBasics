package com.company;

public class Car extends vehicles{
    private int doors;
    private int enginecapacity;

    public Car(String name , int doors, int enginecapacity){
        super(name);
        this.doors = doors;
        this.enginecapacity = enginecapacity;

    }
}
