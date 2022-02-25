package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Christian", calculateHighScorePosition(1500));
        displayHighScorePosition("Jasper", calculateHighScorePosition(1000));
        displayHighScorePosition("Ivette", calculateHighScorePosition(500));
        displayHighScorePosition("Mom", calculateHighScorePosition(100));

    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score <= 1000) {
            return 2;
        } else if (score > 100 && score <= 500) {
            return 3;
        } else {
            return 4;
        }
    }
}

//        int highScoreposition = calculateHighScoreposition(1500);
//        displayHighScorePosition("Tim", highScoreposition);
//
//        highScoreposition = calculateHighScoreposition(900);
//        displayHighScorePosition("Bob", highScoreposition);
//
//        highScoreposition = calculateHighScoreposition(400);
//        displayHighScorePosition("Percy", highScoreposition);
//
//        highScoreposition = calculateHighScoreposition(50);
//        displayHighScorePosition("Gilbert", highScoreposition);
//
//
//
//    }
//
//
//    public static void  displayHighScorePosition(String playerName, int highScorePosition){
//        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
//    }
//    public static int calculateHighScoreposition(int playerScore){
//
//        if(playerScore > 1000) {
//            return 1;
//        } else if(playerScore > 500 && playerScore < 1000){
//            return 2;
//        } else if(playerScore > 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }