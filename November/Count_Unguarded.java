package NOvember;

public class Count_Unguarded {
     public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
          // Initialize the grid with 0 (unoccupied), 1 (wall or guard)
          int[][] grid = new int[m][n];

          // Place walls and guards in the grid
          for (int[] wall : walls) {
               grid[wall[0]][wall[1]] = 1;
          }
          for (int[] guard : guards) {
               grid[guard[0]][guard[1]] = 1;
          }

          // Count the number of cells guarded by each guard
          int guardedCells = 0;
          for (int[] guard : guards) {
               int guardRow = guard[0];
               int guardCol = guard[1];

               // Check north direction
               for (int row = guardRow - 1; row >= 0 && grid[row][guardCol] != 1; row--) {
                    if (grid[row][guardCol] == 0) {
                         grid[row][guardCol] = -1; // Mark as guarded
                         guardedCells++;
                    }
               }

               // Check south direction
               for (int row = guardRow + 1; row < m && grid[row][guardCol] != 1; row++) {
                    if (grid[row][guardCol] == 0) {
                         grid[row][guardCol] = -1; // Mark as guarded
                         guardedCells++;
                    }
               }

               // Check west direction
               for (int col = guardCol - 1; col >= 0 && grid[guardRow][col] != 1; col--) {
                    if (grid[guardRow][col] == 0) {
                         grid[guardRow][col] = -1; // Mark as guarded
                         guardedCells++;
                    }
               }

               // Check east direction
               for (int col = guardCol + 1; col < n && grid[guardRow][col] != 1; col++) {
                    if (grid[guardRow][col] == 0) {
                         grid[guardRow][col] = -1; // Mark as guarded
                         guardedCells++;
                    }
               }
          }

          // Calculate the number of unguarded cells
          int totalCells = m * n;
          int occupiedCells = guards.length + walls.length;
          int unguardedCells = totalCells - occupiedCells - guardedCells;

          return unguardedCells;
     }

     public static void main(String[] args) {

     }
}