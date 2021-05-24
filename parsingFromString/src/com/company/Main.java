package com.company;

public class Main {

    public static void main(String[] args) {
        String numberasstring = "2018";
        System.out.println(" number as string = "+numberasstring);

        int number  = Integer.parseInt(numberasstring);
        System.out.println(" number = "+ number);
        numberasstring+=1;
        number+=1;
        System.out.println(numberasstring+" " + number);

        numberasstring = "2018.125";
        double numb = Double.parseDouble(numberasstring);
        numb+=1;
        System.out.println(numb);
    }

    public static boolean canPack(int bigcount,int smallcount,int goal){

    }
}
