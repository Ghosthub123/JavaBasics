package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativaresolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativaresolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativaresolution = nativaresolution;
    }

    public void drawpixelat(int x , int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in color "+ color);
    }

    public Resolution getNativaresolution() {
        return nativaresolution;
    }
}
