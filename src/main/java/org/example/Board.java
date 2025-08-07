package org.example;


import lombok.Data;

import java.util.HashMap;

@Data
public class Board {
   private final HashMap<Integer, Integer> snakes;
   private final HashMap<Integer, Integer> ladders;

   public Board(HashMap<Integer, Integer> snakes, HashMap<Integer, Integer> ladders) {
       this.snakes = snakes;
       this.ladders = ladders;
   }

   public int getNextPosition(int position) {
       if (snakes.containsKey(position)) return snakes.get(position);
       if (ladders.containsKey(position)) return ladders.get(position);
       return position;
   }
}
