package May;

import java.util.*;

public class Score_After_Flipping_Matrix {
     public int matrixScore(int[][] grid) {
          int n = grid.length;
          int m = grid[0].length;

          // Flip rows to ensure the leftmost column has all 1s.
          for (int i = 0; i < n; i++) {
               if (grid[i][0] == 0) {
                    for (int j = 0; j < m; j++) {
                         grid[i][j] ^= 1;
                    }
               }
          }

          // Flip columns if the number of 1s in a column is less than the number of 0s.
          for (int j = 1; j < m; j++) {
               int colCount = 0;
               for (int i = 0; i < n; i++) {
                    colCount += grid[i][j];
               }

               if (colCount < n - colCount) {
                    for (int i = 0; i < n; i++) {
                         grid[i][j] ^= 1;
                    }
               }
          }

          // Calculate the final score.
          int ans = 0;
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    ans += grid[i][j] * (1 << (m - 1 - j));
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}