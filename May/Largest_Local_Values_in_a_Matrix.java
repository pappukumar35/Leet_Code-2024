package May;

import java.util.*;

public class Largest_Local_Values_in_a_Matrix {
     public int[][] largestLocal(int[][] grid) {

          int n = grid.length;

          int maxLocal[][] = new int[n - 2][n - 2];

          for (int i = 0; i < n - 2; i++) {
               for (int j = 0; j < n - 2; j++) {
                    maxLocal[i][j] = findMax(grid, i, j);
               }
          }
          return maxLocal;
     }

     private int findMax(int grid[][], int x, int y) {
          int maxEle = 0;
          for (int i = x; i < x + 3; i++) {
               for (int j = y; j < y + 3; j++) {
                    maxEle = Math.max(maxEle, grid[i][j]);
               }
          }
          return maxEle;
     }

     public static void main(String[] args) {

     }
}
