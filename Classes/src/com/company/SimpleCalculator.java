package com.company;

public class SimpleCalculator {
    private  double firstnumber;
    private double secondnumber;


    public double getFirstnumber() {
        return firstnumber;
    }

    public double getSecondnumber() {
        return secondnumber;
    }

    public void setFirstnumber(double firstnumber) {
        this.firstnumber = firstnumber;
    }

    public void setSecondnumber(double secondnumber) {
        this.secondnumber = secondnumber;
    }
    public double getaddition(){
        return (this.firstnumber + this.secondnumber);
    }
}


