package com.company;

public class fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }

    private void swim(int speed){
        movemuscle();
        movebackfin();
        super.move(speed);
    }
    private void movemuscle(){

    }
    private void movebackfin(){

    }

}
