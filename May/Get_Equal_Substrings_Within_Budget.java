package May;

import java.util.*;

public class Get_Equal_Substrings_Within_Budget {

     public int equalSubstring(String s, String t, int maxCost) {
          int l = 0, cost = 0, result = 0;

          for (int r = 0; r < s.length(); r++) {
               cost += Math.abs(s.charAt(r) - t.charAt(r));

               while (cost > maxCost) {
                    cost -= Math.abs(s.charAt(l) - t.charAt(l));
                    l++;
               }

               result = Math.max(result, r - l + 1);
          }

          return result;
     }

     public static void main(String[] args) {

     }
}