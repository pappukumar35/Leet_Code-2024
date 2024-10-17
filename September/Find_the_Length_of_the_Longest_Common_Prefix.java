package September;

import java.util.HashSet;

public class Find_the_Length_of_the_Longest_Common_Prefix {
     public int longestCommonPrefix(int[] arr1, int[] arr2) {
          HashSet<Integer> hs = new HashSet<>();

          for (int c : arr1) {
               while (c > 0) {
                    hs.add(c);
                    c /= 10;
               }
          }
          int res = 0;
          for (int c : arr2) {
               while (c > 0) {
                    if (hs.contains(c)) {
                         res = Math.max(res, c);
                         break;
                    }
                    c /= 10;
               }
          }
          if (res == 0) {
               return 0;
          }
          StringBuilder str = new StringBuilder(String.valueOf(res));
          return str.length();
     }

     public static void main(String[] args) {

     }
}