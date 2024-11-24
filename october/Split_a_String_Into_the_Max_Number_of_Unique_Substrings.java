package october;

import java.util.HashSet;

public class Split_a_String_Into_the_Max_Number_of_Unique_Substrings {
     public int maxUniqueSplit(String s) {
          return helper(s, new HashSet<>());
     }

     public int helper(String s, HashSet<String> visited) {
          int max = 0;
          for (int i = 1; i <= s.length(); i++) {
               String temp = s.substring(0, i);
               if (visited.add(temp)) {
                    max = Math.max(max, 1 + helper(s.substring(i), visited));
                    visited.remove(temp);
               }
          }
          return max;
     }

     public static void main(String[] args) {

     }
}
