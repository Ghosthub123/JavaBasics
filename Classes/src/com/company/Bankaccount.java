package com.company;

public class Bankaccount {
    private double accountnumber;
    private double balance;
    private String name;
    private double PhoneNo;

    public double getAccountnumber() {
        return accountnumber;
    }

    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;

    }

    public double getPhoneNo() {
        return PhoneNo;
    }

    public double deposite(double balance){
        this.balance = balance;
        return this.balance;
    }

    public double withdrawl(double balance){
        if (balance > this.balance){
            return -1;
        }
        else this.balance = (this.balance - balance);
            return this.balance;
    }

    public void setAccountnumber(double accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(double phoneNo) {
        PhoneNo = phoneNo;
    }
}
