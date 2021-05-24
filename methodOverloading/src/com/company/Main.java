package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(124,30));


        // ||||||||||

        System.out.println(getDurationString(3600));

    }
//    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
//        if ((feet >=0) ||  (inches >=0) && (inches <=12)){
//            double centimeters = feet * 0.032

    public static String getDurationString(int minutes, int seconds){
        if ((minutes >=0) &&  (seconds>=0)){
            double hours = (minutes/60f) + (seconds/3600f);
            return (Math.round(hours)+"h"+(minutes%60)+"m"+(seconds%3600)+"s");
        }else return "Invalid Index";
    }
    public static String getDurationString(int seconds){
        if (seconds>=0){
            int minutes = seconds/60;
            return getDurationString(minutes,seconds);
        }else return "Invalid Range";
    }


}
