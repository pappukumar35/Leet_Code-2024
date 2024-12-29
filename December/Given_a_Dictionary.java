package December;

import java.util.Arrays;

public class Given_a_Dictionary {
     public int numWays(String[] words, String target) {
          int MOD = (int) 1e9 + 7;
          int n = words[0].length();
          int m = target.length();

          int[][] freq = new int[n][26];
          for (String word : words) {
               for (int i = 0; i < n; i++) {
                    freq[i][word.charAt(i) - 'a']++;
               }
          }

          int[][] memo = new int[n + 1][m + 1];
          for (int[] row : memo) {
               Arrays.fill(row, -1);
          }

          return traverse(0, 0, freq, target, memo, MOD);
     }

     private int traverse(int level, int index, int[][] freq, String target, int[][] memo, int MOD) {
          if (index == target.length()) {
               return 1;
          }
          if (level == freq.length) {
               return 0;
          }
          if (memo[level][index] != -1) {
               return memo[level][index];
          }

          int ways = traverse(level + 1, index, freq, target, memo, MOD);

          if (freq[level][target.charAt(index) - 'a'] > 0) {
               ways = (int) ((ways + (long) freq[level][target.charAt(index) - 'a']
                         * traverse(level + 1, index + 1, freq, target, memo, MOD)) % MOD);
          }

          memo[level][index] = ways;
          return ways;
     }

     public static void main(String args[]) {

     }
}