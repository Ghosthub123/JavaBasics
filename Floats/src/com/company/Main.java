package com.company;

public class Main {

    public static void main(String[] args) {
        float minFloatvalue = Float.MIN_VALUE;
        float maxFloatvalue = Float.MAX_VALUE;

        System.out.println(" my float min = " + minFloatvalue);
        System.out.println(" my float max = " + maxFloatvalue);

        double minDoublevalue = Double.MIN_VALUE;
        double maxDoublevalue = Double.MAX_VALUE;

        System.out.println(" my double min = " + minDoublevalue);
        System.out.println(" my double max = " + maxDoublevalue);

//        when declaring literals . using f,d, are good pratice

        int myintvalue = 5 / 2;
//        float myfloatvalue = (float) 5.45;
        //              OR
        float myfloatvalue = 5.45f / 2f;

        double mydoublevalue = 5d / 2d;

        System.out.println(" Myintval = " + myintvalue);
        System.out.println(" Myfloatval = "+myfloatvalue);
        System.out.println(" Mydoubleval = "+ mydoublevalue);
    }
}

