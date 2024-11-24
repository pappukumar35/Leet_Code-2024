package Aprial;

import java.util.*;

public class Number_of_Islands {
     // Fields to store the number of rows and columns of the grid, and the count of
     // islands.
     int rows;
     int cols;
     int islands = 0;

     // Method to count the number of islands in a 2D grid.
     public int numIslands(char[][] grid) {
          // Initialize rows and cols with the dimensions of the grid.
          rows = grid.length;
          cols = grid[0].length;
          // Loop through each row of the grid to perform check.
          for (int row = 0; row < rows; row++)
               check(grid, row);
          // Return the total count of islands found.
          return islands;
     }

     // Helper method to check each row of the grid.
     public void check(final char[][] grid, int row) {
          // Fetches the current row from the grid.
          final char[] finalRow = grid[row];
          // Iterate over each column in the row.
          for (int col = 0; col < cols; ++col)
               // If the current cell contains '1', it's part of an island.
               if (finalRow[col] == '1') {
                    // Perform breadth-first search to mark all parts of the island.
                    bfs(grid, row, col);
                    // Increment the islands counter after marking a complete island.
                    ++islands;
               }
     }

     // Method to perform breadth-first search to explore all parts of the island.
     public void bfs(char[][] grid, int row, int col) {
          // Mark the current cell so it won't be revisited.
          grid[row][col] = '*';
          // Recursively visit all adjacent cells that are part of the island ('1').
          if (row > 0 && grid[row - 1][col] == '1')
               bfs(grid, row - 1, col);
          if (row + 1 < rows && grid[row + 1][col] == '1')
               bfs(grid, row + 1, col);
          if (col > 0 && grid[row][col - 1] == '1')
               bfs(grid, row, col - 1);
          if (col + 1 < cols && grid[row][col + 1] == '1')
               bfs(grid, row, col + 1);
     }

     public static void main(String[] args) {

     }

}
