package com.company;

public class Vehicle {
    private String name;
    private int body;

    public void setName(String name) {
        this.name = name;
    }
    public void setBody(int body){
        this.body = body;
    }

    public int getBody() {
        return body;
    }

    public String getName() {
        return name;
    }
    public void move(int speed){
        System.out.println("Vehicle.move() called vehicle is moving at " + speed);
    }
}
