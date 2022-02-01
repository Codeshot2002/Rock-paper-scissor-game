package com.company;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        System.out.println("Rock, Paper and Scissor Game \nType 'Rock', 'Paper' or 'Scissor' to choose : ");

        int bot = 0;
        int playerPoints = 0;
        int botPoints = 0;
        int totalGames = 3;
        int player = 3;

        for(int i = 0; i<totalGames; i++) {
            Random rand = new Random();
            bot = rand.nextInt(3);

            Scanner sc = new Scanner(System.in);
            String input = sc.next();

            //This is to convert string to int value
            if (input.equalsIgnoreCase("rock")) {
                player = 0;

            } else if (input.equalsIgnoreCase("paper")) {
                player = 1;
            } else if (input.equalsIgnoreCase("scissor")) {
                player = 2;
            } else {
                System.out.println("You typed something wrong, try again!");
            }
            //this is check that who won or who lose the game!
            switch (player) {
                //case 0 is rock
                case 0:
                    if (bot == player) {
                        System.out.println("=>Rock \nThis is a draw!");
                        totalGames += 1;
                    } else if (bot == 1) {
                        System.out.println("=>Paper \nYou lose!");
                        botPoints += 1;
                    } else if (bot == 2) {
                        System.out.println("=>Scissor \nYou win this round!");
                        playerPoints +=1;
                    }
                    break;
                //this is for paper
                case 1:
                    if (bot == player) {
                        System.out.println("=>Rock \nThis is a draw!");
                        totalGames += 1;
                    } else if (bot == 2) {
                        System.out.println("=>Scissor \nYou lose!");
                        botPoints += 1;
                    } else if (bot == 0) {
                        System.out.println("=>Rock \nYou win this round!");
                        playerPoints +=1;
                    }
                    break;
                //this is for scissor
                case 2:
                    if (bot == player) {
                        System.out.println("=>Rock \nThis is a draw!");
                        totalGames += 1;
                    } else if (bot == 0) {
                        System.out.println("=>Rock \nYou lose!");
                        botPoints += 1;
                    } else if (bot == 1) {
                        System.out.println("=>Paper \nYou win this round!");
                        playerPoints +=1;
                    }
                    break;
            }
        }
        if(playerPoints>botPoints)
        {
            System.out.println("Congratualtions you are the winner!!");
        }
        else
            System.out.println("You lost the game, Better luck next time!");
    }
}