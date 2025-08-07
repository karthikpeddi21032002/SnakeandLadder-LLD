package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Player player1 = new Player("kasrthik","1", 0);
        Player player2 = new Player("kasrthik","2", 0);
        HashMap<Integer, Integer> snakes = new HashMap<>();
        HashMap<Integer, Integer> ladder = new HashMap<>();
        snakes.put(25,10);
        snakes.put(38,21);
        snakes.put(45,32);
        snakes.put(88,18);
        snakes.put(98,23);

        ladder.put(8,14);
        ladder.put(20,36);
        ladder.put(48,68);
        ladder.put(78,99);
        Dice dice = new Dice();
        Board board = new Board(snakes, ladder);
        Game game = new Game(board,dice);
        game.startGame(player1,player2);

    }
}