package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeths;
    private String coat;

    public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeths,String coat) {
        super(name, 1, 1, size, weight);
//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
        this.eyes =  eyes;
        this.legs = legs;
        this.coat = coat;
        this.tail = tail;
        this.teeths = teeths;
        this.coat = coat;


    }
    private void chew(){
        System.out.println(" Dod.chew() called ");
    }

    @Override
    public void eat() {
        System.out.println(" Dog.eat() called ");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called !!");
        move(5);

    }
    public void run(){
        System.out.println(" Dog.run() called !! ");
        super.move(10);
    }

    public void movelegs(int speed){
        System.out.println("Dog.movelegs() called ");
    }

    @Override
    public void move(int speed) {
        System.out.println(" Dog.moveLegs() ");
        super.move(speed);
    }
}
