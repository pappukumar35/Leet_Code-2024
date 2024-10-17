package July;

import java.util.*;

public class Three_Consecutive_Odds {
     public boolean threeConsecutiveOdds(int[] arr) {
          int odds = 0;
          for (int i = 0; i < arr.length && odds < 3; i++) {
               odds = (arr[i] % 2 == 1) ? odds + 1 : 0;
          }
          return odds == 3;
     }

     public static void main(String[] args) {

     }
}