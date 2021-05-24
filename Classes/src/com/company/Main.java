package com.company;

public class Main {

    public static void main(String[] args) {
//        Car porche = new Car();
//        Car holden = new Car();
//
//        porche.setModel("Carreri");
//
//        System.out.println("Model is " + porche.getModel());
//
//        SimpleCalculator sum = new SimpleCalculator();
//
//        sum.setFirstnumber(15);
//        sum.setSecondnumber(15);
//        System.out.println(sum.getaddition());

        Bankaccount acc = new Bankaccount();

        acc.setAccountnumber(12890011);
        acc.setName("Dhananjay Pande");
        acc.setPhoneNo(89113245);
        acc.deposite(10000);
        acc.withdrawl(500);

        System.out.println(" Account no: "+ acc.getAccountnumber());
        System.out.println(" Name: "+acc.getName());
        System.out.println(" PhoneNo: "+acc.getPhoneNo());
        System.out.println(" the remaining balance is "+acc.getBalance());
    }
}
