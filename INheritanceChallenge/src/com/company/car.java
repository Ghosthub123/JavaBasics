package com.company;

public class car extends Vehicle{
    private int engine;
    private int tyres;
    private int gear;

    public car(int engine,int tyres,int gear){
        this.engine  = engine;
        this.tyres  = tyres;
        this.gear  = gear;
    }

    public int getTyres() {
        return tyres;
    }

    public int getEngine() {
        return engine;
    }

    public int getGear() {
        return gear;
    }

    private void movebody(int speed){
        System.out.println("Car is moving at " + speed);
    }

    @Override
    public void move(int speed) {
       movebody(speed);
    }
}
