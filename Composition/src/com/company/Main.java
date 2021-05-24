package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case thecase = new Case("2208","Dell","240",dimensions);

        Monitor themonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));

        Motherboard themotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
        PC thepc = new PC(thecase,themonitor,themotherboard);
        thepc.powerup();

//        thepc.getMonitor().drawpixelat(1500,1200,"red");
//        thepc.getMotherboard().loadprogram("Windows 10");
//        thepc.getTheCase().presspowerbutton();
    }
}
