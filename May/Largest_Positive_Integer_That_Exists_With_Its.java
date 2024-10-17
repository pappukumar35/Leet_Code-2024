package May;

import java.util.*;

public class Largest_Positive_Integer_That_Exists_With_Its {
     public int findMaxK(int[] nums) {
          int[] sum = new int[1001];
          int max = -1;
          for (int n : nums) {
               int index = n > 0 ? n : -n;
               if (sum[index] != n) {
                    sum[index] += n;
               }

               if (sum[index] == 0) {
                    max = max > index ? max : index;
               }
          }
          return max;
     }

     public static void main(String[] args) {

     }
}