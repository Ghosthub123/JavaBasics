package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
//        while (count != 5){
//            System.out.println("count value is = "+count);
//            count++;
//        }

//        count = 1;
//
//        while (true){
//            if (count== 6){
//                break;
//            }
//            System.out.println(" count value is = "+count);
//            count++;
//        }
//
        count = 1;
        do {
            System.out.println("count value was "+count);
            count++;
        }while (count!=6);



        int startNumber = 4;
        int finishnumber = 20;

        while (startNumber<=finishnumber){

            if (isEven(startNumber)){
                System.out.println(startNumber + " is even ");
            }else {
                System.out.println(startNumber + " is odd ");
            }
            startNumber++;

        }

        System.out.println(ispallindrom(-11211));


        System.out.println(" sum of first and last number is = "+firstAndLastDigit(-5));

        System.out.println(" sum of even numbers =  "+sumOfEvenDigits(25267));
        }
    public static boolean isEven(int number){

        if (number%2==0){
            return true;
        }return false;

    }

    public static boolean ispallindrom(int number){
        int reverse = 0;
        int temp = Math.abs(number);
        while(temp>0) {


            int lastdigit = (temp%10);
            reverse = reverse*10;
            reverse+=lastdigit;
            temp=temp/10;


        }
        if (reverse==Math.abs(number)){
            return true;
        }else return false;
    }

    public static int firstAndLastDigit(int number){
        if (number>=10) {
            int lastnumber = number % 10;
            int mynum = 0;
            System.out.println(lastnumber);
            while (number > 0) {
                number = number / 10;
                System.out.println(number);
                if (number != 0) {
                    mynum = number;
                }

            }
            int firstnumber = mynum;
            return (lastnumber + firstnumber);
        }else if (number<0){
            return -1;
        }
        else return number*2;
    }

    public static int sumOfEvenDigits(int number){
        if (number<0){
            return -1;
        }
        int finalnumber = 0;
        int lastnumber = 0;
        while (number>0){
            lastnumber = number%10;
            if (lastnumber%2==0){
                finalnumber+=lastnumber;
            }
            number = number/10;
        }return finalnumber;
    }




}
