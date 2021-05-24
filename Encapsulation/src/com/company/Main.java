package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Player 1";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.losehealth(damage);
//        System.out.println(" remaing health  = "+player.healthremaining());
//
//        damage = 11;
//        player.losehealth(damage);
//        System.out.println(" remaing health  = "+player.healthremaining());

        EnhancedPlayer player = new EnhancedPlayer("PLayer 1",500,"SWORD");
        System.out.println("initial health is  = " + player.getHealth());

    }
}
