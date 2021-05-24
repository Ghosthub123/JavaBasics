package com.company;

public class Motherboard {

    private String model;
    private String maniufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String maniufacture, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.maniufacture = maniufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManiufacture() {
        return maniufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManiufacture(String maniufacture) {
        this.maniufacture = maniufacture;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public void loadprogram(String programname){
        System.out.println("Program " + programname + " is now loading ...");
    }
}
