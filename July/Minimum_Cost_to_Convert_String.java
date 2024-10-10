package July;

import java.util.*;

public class Minimum_Cost_to_Convert_String {
     public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
          long arr[][] = new long[26][26];
          for (int i = 0; i < 26; i++) {
               Arrays.fill(arr[i], Integer.MAX_VALUE);
               arr[i][i] = 0;
          }
          for (int i = 0; i < original.length; i++) {
               int val1 = original[i] - 'a';
               int val2 = changed[i] - 'a';
               arr[val1][val2] = Math.min(arr[val1][val2], cost[i]);
          }
          for (int i = 0; i < 26; i++) {
               for (int j = 0; j < 26; j++) {
                    for (int k = 0; k < 26; k++) {
                         arr[j][k] = Math.min(arr[j][k], arr[j][i] + arr[i][k]);
                    }
               }
          }
          long ans = 0;
          for (int i = 0; i < source.length(); i++) {
               int val1 = source.charAt(i) - 'a';
               int val2 = target.charAt(i) - 'a';

               if (val1 == val2) {
                    continue;
               }

               if (arr[val1][val2] == Integer.MAX_VALUE) {
                    return -1L;
               } else {
                    ans += arr[val1][val2];
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }

}