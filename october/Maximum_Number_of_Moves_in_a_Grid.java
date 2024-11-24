package october;

public class Maximum_Number_of_Moves_in_a_Grid {

   public int maxMoves(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      int dp[][] = new int[m][n];

      for (int i = 0; i < m; i++) {
         dfs(grid, i, 0, m, n, 0, dp);
      }
      return answer;
   }

   int moves[] = { -1, 0, 1 };
   int answer = 0;

   void dfs(int[][] grid, int r, int c, int m, int n, int ans, int[][] dp) {
      answer = Math.max(answer, ans);
      for (int move : moves) {
         int i = r + move;
         int j = c + 1;
         if (i == -1 || j == -1 || i == m || j == n)
            continue;
         if (grid[i][j] > grid[r][c]) {
            if (ans + 1 > dp[i][j]) {
               dp[i][j] = ans + 1;
               dfs(grid, i, j, m, n, ans + 1, dp);
            }
         }
      }
   }

   public static void main(String args[]) {

   }
}