package July;

import java.util.*;
import java.util.*;

public class Find_the_Winner_of_the_Circular_Game {
     public int findTheWinner(int n, int k) {
          List<Integer> friends = new ArrayList<>();
          for (int i = 1; i <= n; i++) {
               friends.add(i);
          }

          int current_position = 0;

          while (n > 1) {
               current_position = (current_position + (k - 1)) % n;
               friends.remove(current_position);
               n--;
          }

          return friends.get(0);
     }

     public static void main(String[] args) {

     }
}