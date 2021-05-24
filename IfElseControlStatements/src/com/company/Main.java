package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 4000;
        int levelcompleted = 5;
        int bonus = 100;

        displayhighscoreposition("Amir",calculaehighscore(400));

        //calculatescore();
        int highscore = CalculateScoreWithParameters(true,2000,80,1000);
        if(score < 5000 && score > 1000 ){
            System.out.println("Your score was less than 5000");
        }else if (score < 1000){
            System.out.println(" Your score is less than 1000");
        }else {
            System.out.println(" got here");
        }

        // challenge

        if(gameover){
            int finalscore = score + (levelcompleted*bonus);
            System.out.println(" Your final score is "+ finalscore);
        }

        System.out.println("You high scoer is " + highscore );

    }
    public static void calculatescore(){
        boolean gameover2 = true;
        int score2 = 5000;
        int levelcompleted2 = 5;
        int bonus2 = 100;

        if(score2 <=  5000 && score2 > 1000 ){
            System.out.println("Your score was less than 5000");
        }else if (score2 < 1000){
            System.out.println(" Your score is less than 1000");
        }else {
            System.out.println(" got here");
        }

    }
    public static int CalculateScoreWithParameters(boolean gameover , int score , int levelcompleted , int bonus){
        if(gameover){
            if (score <= 5000 && score >= 1000){
                System.out.println(" score is between 5000 to 1000");
            }else if (score <= 1000 && score >= 0){
                System.out.println(" Score is between 0 and 1000");
            }else {
                System.out.println(" score is zero ");
            }

            int finalscore  = score + (levelcompleted * bonus);
            System.out.println("finalscore is " + finalscore);
            return finalscore;
        }
        return -1;
    }

    // challenge

    public static void displayhighscoreposition(String name , int positionhighscore){
        System.out.println("The player "+name + " got " + positionhighscore + " on the high score table");
    }
    public static int calculaehighscore(int playerscore){
        if (playerscore>=1000){
            return 1;
        }else if (playerscore > 500 && playerscore < 1000){
            return 2;
        }else if (playerscore > 100 && playerscore < 500){
            return 3;
        }
        return 4;
    }

}
