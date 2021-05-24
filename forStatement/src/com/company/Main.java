package com.company;

public class Main {

    public static void main(String[] args) {

        sum3and5(1,1000);






        System.out.println(" 10,000 at 2% interest is "+calcinterestrate(10000.0,2.0));
        System.out.println(" 10,000 at 3% interest is "+calcinterestrate(10000.0,3.0));
        System.out.println(" 10,000 at 4% interest is "+calcinterestrate(10000.0,4.0));
        System.out.println(" 10,000 at 5% interest is "+calcinterestrate(10000.0,5.0));
        System.out.println(" 10,000 at 6% interest is "+calcinterestrate(10000.0,6.0));

// Introduction for FOR loop

        for (int i=0; i < 5 ; i++){
            System.out.println("loop "+i+" hello world");
        }


       for (int i = 5 ; i <= 10 ; i++){
           System.out.println(" 10,000 at "+i+"% interest is "+String.format("%.2f",calcinterestrate(10000.0,i)));
       }

        System.out.println(isprime(3));
    }

    public static double calcinterestrate(double amount, double interestrate){
        return (amount * (interestrate/100));
    }

    public static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {

                return false;
            }
        }
        return true;
    }
    public static void sum3and5(int number1 , int number2){
        int sum = 0;
        int count = 0;
        for (int i = number1;i<=number2;i++){
            if ((i%3==0) && (i%5 == 0)){
                sum+=i;
                System.out.println("number is "+ i);
                count++;
                if (count==5){
                    break;
                }
            }
        }
        System.out.println("sum is "+sum);
    }



}
