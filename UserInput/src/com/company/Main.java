package com.company;

import java.sql.Time;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter you year of birth:");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){


            int yearOfBirth = scanner.nextInt();


            scanner.nextLine(); // handle next line chracter
            System.out.println(" Enter your name : ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if (age>=0 && age<=100){
                System.out.println(" your name is:" + name + ", and you are " + age + " year old ");


            }else System.out.println(" Error date out of range!!");

        }else System.out.println(" enter valid birth date!!");
        scanner.close();




        int mysum = 0;

        Scanner mynumberscanner = new Scanner(System.in);

        int counter = 0;

        while (true){
            int order = counter + 1;
            System.out.println(" Enter the #"+order+" : ");

            boolean isInt = mynumberscanner.hasNextInt();

            if (isInt){
                int mynum = mynumberscanner.nextInt();
                counter++;
                mysum+=mynum;
                if(counter == 10){
                    break;
                }
            }else {
                System.out.println(" Invalid number!!");
            }
            mynumberscanner.nextLine();
        }
        System.out.println(" sum of "+10+" numbers is "+mysum);
        mynumberscanner.close();
    }


    public static int sum(int number){
        int sum = 0;
        sum+=number;
        return sum;
    }
}
