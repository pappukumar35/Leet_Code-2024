package November;

import java.util.HashMap;
import java.util.LinkedList;

public class Sliding_Puzzle {
     private static HashMap<Integer, Integer> cache = preCompute();

     public int slidingPuzzle(int[][] board) {
          int output = 0;
          for (int i = 0; i < 2; i++)
               for (int j = 0; j < 3; j++)
                    output = (output << 3) + board[i][j];
          return cache.getOrDefault(output, -1);
     }

     private static HashMap<Integer, Integer> preCompute() {
          HashMap<Integer, Integer> output = new HashMap<>();
          int[][] moves = new int[][] { { 1, 3 }, { 0, 2, 4 }, { 1, 5 }, { 0, 4 }, { 1, 3, 5 }, { 2, 4 } };
          LinkedList<int[]> queue = new LinkedList<>();
          output.put(42792, 0);
          queue.add(new int[] { 42792, 0 });
          for (int i = 1; !queue.isEmpty(); i++)
               for (int j = queue.size(); j > 0; j--) {
                    int[] top = queue.removeFirst();
                    for (int move : moves[top[1]]) {
                         int next = top[0];
                         int t = next >> move * 3 & 7;
                         next -= (t << move * 3) - (t << top[1] * 3);
                         if (!output.containsKey(next)) {
                              output.put(next, i);
                              queue.add(new int[] { next, move });
                         }
                    }
               }
          return output;
     }

     public static void main(String[] args) {

     }
}