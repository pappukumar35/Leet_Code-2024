package Aprial;

import java.util.*;
import java.util.*;

public class Minimum_Falling_Path_Sum {
     public int solve(int r, int c, int[][] grid, int[][] dp) {
          int n = grid.length;
          int m = grid[0].length;
          // base case
          if (r < 0 || r >= n || c < 0 || c >= m)
               return Integer.MAX_VALUE;

          // If at the bottom row, return the value at this position
          if (r == n - 1)
               return grid[r][c];

          // If the value at this position has been calculated before, return it
          if (dp[r][c] != -1)
               return dp[r][c];

          int sum = grid[r][c];
          int p = Integer.MAX_VALUE;
          // Iterate over all columns in the next row to find the minimum value
          for (int j = 0; j < m; j++) {
               if (j != c) {
                    int temp = solve(r + 1, j, grid, dp);
                    p = Math.min(p, temp);
               }
          }
          sum += p; // Add the minimum value from the next row to the current sum
          return dp[r][c] = sum; // Memoize and return the result
     }

     // Main function to find the minimum falling path sum
     public int minFallingPathSum(int[][] grid) {
          int n = grid.length;
          int m = grid[0].length;

          int ans = Integer.MAX_VALUE;
          // Iterate over all columns in the first row to start the falling path
          for (int i = 0; i < m; i++) {
               int[][] dp = new int[n][m]; // Initialize DP table with -1
               for (int[] row : dp)
                    Arrays.fill(row, -1);
               ans = Math.min(ans, solve(0, i, grid, dp)); // Update answer with minimum falling path sum starting from
                                                           // each column
          }
          return ans; // Return the minimum falling path sum
     }

     public static void main(String[] args) {

     }
}