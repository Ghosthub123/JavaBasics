package com.company;

public class Main {

    public static void main(String[] args) {
        int Myvalue = 1000;
        int myMinvalue = Integer.MIN_VALUE;
        int mymaxvalue = Integer.MAX_VALUE;
        System.out.println("My min integer type value "+  myMinvalue);
        System.out.println("My max int type value " + (mymaxvalue) );
//  overflow underflow     System.out.println("My max int type value " + (mymaxvalue+-1) );
        byte mybyteminvalue = Byte.MIN_VALUE;
        byte mybytemaxvalue = Byte.MAX_VALUE;
        System.out.println("my byte max value "+ mybytemaxvalue);
        System.out.println(" my byte min value" + mybyteminvalue);

        short myShortminvalue = Short.MIN_VALUE;
        short myShortmaxvalue = Short.MAX_VALUE;
        System.out.println("my Short max value "+ myShortmaxvalue);
        System.out.println(" my Short min value" + myShortminvalue);

        long myLongvalue = 100l;
        long myLongminvalue = Long.MIN_VALUE;
        long myLongmaxvalue = Long.MAX_VALUE;
        System.out.println("my Long max value "+ myLongmaxvalue);
        System.out.println(" my Long min value" + myLongminvalue);
        long biglongliteralvalue = 3452543567L;
        System.out.println(biglongliteralvalue);

        int mytotal  = (myMinvalue / 2);

        byte mynewbytevaluev = (byte) (mybyteminvalue / 2);

        short mynewshortvalue = (short) (myShortminvalue / 2);

//        Challenge
        byte challengevar = 127;

        short mycahllengeshortvar = 500;

        int mychallangevar = 7809;

        long mycahllengevar = 50000L + 10L*(challengevar + mycahllengeshortvar + mychallangevar);

        System.out.println(" my challenge var = " + mycahllengevar);

        short myshortotal = (short) (1000 + 10*
                (challengevar + mycahllengeshortvar + mycahllengevar ));

        System.out.println("my short total "+ myshortotal);
    }
}
