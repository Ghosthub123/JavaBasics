package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean isAlien = false;

	    if (isAlien == false) {
            System.out.println(" it is not alien !! ");
        }
	    // ternary operator

        boolean mycar = false;

	    if (mycar);
        {
            System.out.println(" this is true my car ");
        }

        boolean wascar = mycar ? true : false;

        if (wascar){
            System.out.println(" this is true");
        }

        int ageofclient = 20;

        boolean iseighteenorover = ageofclient == 20 ? true : false;

        System.out.println(iseighteenorover);


        // challenge

        double mychallengevar = 20.00d;
        double myseconddouble = 80.00d;
        double total =mychallengevar + myseconddouble*100.00d;

        double remainder = total % 40d;

        System.out.println("my remainder is "+remainder);


        boolean isNotRemainder = (remainder == 0 ) ? true : false;
        System.out.println(" is not remainder is "+ isNotRemainder);

        if (!isNotRemainder){
            System.out.println(" is not remainder ");
        }


        }


}
