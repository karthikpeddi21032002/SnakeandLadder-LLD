package org.example;

import java.util.Scanner;

public class Game {
    private final Dice dice;
    private final Board board;
    private final Scanner scanner = new Scanner(System.in);

    public Game(Board board,Dice dice) {
        this.board = board;
        this.dice = dice;
    }

    public void startGame(Player p1, Player p2) {
        boolean flag = false;
        while (true) {
            if (!flag) {
                System.out.println("It's Player 1's turn. Press Enter to roll the dice...");
                scanner.nextLine();
                int getcurr = p1.getCurrPosition();
                int roll = dice.rolldice();
                System.out.println("Player 1 rolled dice the number is " + roll);
                if (getcurr + roll <= 100) {
                    int next = getcurr + roll;
                    int finalPos = board.getNextPosition(next);
                    if (finalPos < next) {
                        System.out.println("Player 1 was caught by a snake and reached its tail: " + finalPos);
                    } else if (finalPos > next) {
                        System.out.println("Player 1 climbed a ladder and reached: " + finalPos);
                    }
                    p1.setCurrPosition(finalPos);
                } else {
                    System.out.println("Player 1 rolled too high to finish, stays at position " + getcurr);
                }
                System.out.println("Player 1 is now at position: " + p1.getCurrPosition());
                if (p1.getCurrPosition() == 100) {
                    System.out.println("Player 1 won the match");
                    return;
                }
            } else {
                System.out.println("It's Player 2's turn. Press Enter to roll the dice...");
                scanner.nextLine();
                int getcurr = p2.getCurrPosition();
                int roll = dice.rolldice();
                System.out.println("Player 2 rolled dice the number is " + roll);
                if (getcurr + roll <= 100) {
                    int next = getcurr + roll;
                    int finalPos = board.getNextPosition(next);
                    if (finalPos < next) {
                        System.out.println("Player 2 was caught by a snake and reached its tail: " + finalPos);
                    } else if (finalPos > next) {
                        System.out.println("Player 2 climbed a ladder and reached: " + finalPos);
                    }
                    p2.setCurrPosition(finalPos);
                } else {
                    System.out.println("Player 2 rolled too high to finish, stays at position " + getcurr);
                }
                System.out.println("Player 2 is now at position: " + p2.getCurrPosition());
                if (p2.getCurrPosition() == 100) {
                    System.out.println("Player 2 won the match");
                    return;
                }
            }
            flag = !flag;
        }
    }
}
