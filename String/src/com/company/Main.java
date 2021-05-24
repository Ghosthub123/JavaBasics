package com.company;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // boolean
        // double
        // float
        // long
        // char
        String mystring = "This is a string";
        System.out.println("my string = "+ mystring);
        mystring = mystring + " , and this  is more.";
        System.out.println("mystring equals to " + mystring);
        mystring = mystring + "\u00A9 2019";
        System.out.println("mystring equals = " + mystring );
        String numberstring = "250.55";
        numberstring = numberstring + "40.55";
        System.out.println("number string is "+ numberstring);
        String laststring = "10";
        int mynum = 50;
        System.out.println(" my string is " + mynum + laststring);

        // Operators
        // + , - , / , % , *

        // Abrevating operators
        int result = 10 ;
        result = result + 1;
        System.out.println(" result is " + result);
        // or
        result++; // result = result + 1;
        System.out.println(" result is "+ result);
        // result--; for result = result - 1;

        // result = result + 2
        result+=2;
        System.out.println(result);

        // reuslt = resdult * 10
        result *= 10;
        System.out.println(result);

        // result = result / 3
        result /= 3;
        System.out.println(result);
    }
}
