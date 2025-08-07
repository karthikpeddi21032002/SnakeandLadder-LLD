package org.example;

import java.util.Random;

public class Dice {

    int rolldice(){
        Random rand = new Random();
        return  rand.nextInt(6)+1;
    }
}
