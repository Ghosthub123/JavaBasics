package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    int value = 3;
	    if (value == 1){
            System.out.println("Print "+ value);
        }else if (value == 2){
            System.out.println("Print "+ value );
        }else {
            System.out.println(value);
        }

	    int switchValue = 5;

	    switch (switchValue){
            case 1:
                System.out.println("Value was one");
                break;
            case 2:
                System.out.println("Value was two");
                break;
            case 3: case 4 : case 5:
                System.out.println("Was a 3 or  4 or 5");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println(" was nor 1 or 2,3,4,5");
                break;

        }

        String month = "JaNUary";

        switch ((month).toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "febuary":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
        //More code here
    }
}
