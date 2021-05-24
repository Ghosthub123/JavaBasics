package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;

        boolean flag = true;

        while (true){
            System.out.println(" Enter number !!:  ");

            boolean isInt = scanner.hasNextInt();


            if(isInt){
                int number = scanner.nextInt();

                if (flag){
                    flag = false;
                    min = number;
                    max = number;
                }
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min  = number;
                }
            }else{
                System.out.println("Invalid syntax!! ");
                break;
            }

            scanner.nextLine();
        }
        System.out.println("max = "+max + " min = "+ min);
        scanner.close();
    }
}
