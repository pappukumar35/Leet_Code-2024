class Cherry_Pickup {
          public int cherryPickup(int[][] grid) {
                    int rows = grid.length;
                    int cols = grid[0].length;
                    return helper(grid, 0, 0, cols - 1);
          }

          public int helper(int[][] grid, int currRow, int robotACol, int robotBCol) {

                    if (robotACol < 0 || robotBCol < 0 || robotACol >= grid[0].length || robotBCol >= grid[0].length)
                              return 0;

                    if (currRow == grid.length)
                              return 0; // last row

                    int result = 0;
                    result += grid[currRow][robotACol];
                    result += grid[currRow][robotBCol];

                    int max = 0; // DFS for next row
                    for (int x = robotACol - 1; x <= robotACol + 1; x++) {
                              for (int y = robotBCol - 1; y <= robotBCol + 1; y++) {
                                        if (x < y) {
                                                  max = Math.max(max, helper(grid, currRow + 1, x, y));
                                        }
                              }
                    }

                    result += max; // add maximum result
                    return result;
          }
}