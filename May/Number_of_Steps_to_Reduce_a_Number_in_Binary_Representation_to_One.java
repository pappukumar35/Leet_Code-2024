package May;

import java.util.*;

public class Number_of_Steps_to_Reduce_a_Number_in_Binary_Representation_to_One {

     public int numSteps(String s) {
          int cnt = 0;
          int cary = 0;

          for (int i = s.length() - 1; i >= 1; i--) {
               int num = s.charAt(i) - '0';
               if (num == 0 && cary == 0) {
                    cnt++;
               } else if (num == 1 && cary == 1) {
                    cnt++;
                    cary = 1;
               } else {
                    cnt += 2;
                    cary = 1;
               }
          }
          if (cary == 1)
               cnt++;
          return cnt;
     }

     public static void main(String[] args) {

     }

}
