package May;

import java.util.*;

public class Path_with_Maximum_Gold {
     public int dfs(int[][] grid, int row, int col) {
          if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] <= 0) {
               return 0;
          }

          grid[row][col] = -grid[row][col];

          int down = dfs(grid, row + 1, col);
          int right = dfs(grid, row, col + 1);
          int up = dfs(grid, row - 1, col);
          int left = dfs(grid, row, col - 1);

          grid[row][col] = -grid[row][col];

          return grid[row][col] + Math.max(Math.max(left, right), Math.max(up, down));
     }

     public int getMaximumGold(int[][] grid) {
          int m = grid.length, n = grid[0].length, ans = 0;
          for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                    if (grid[i][j] != 0)
                         ans = Math.max(ans, dfs(grid, i, j));
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}