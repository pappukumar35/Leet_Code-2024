package Auguest;

public class Convert_1D_Array_Into_2D_Array {
     public int[][] construct2DArray(int[] original, int m, int n) {
          if (m * n != original.length) {
               return new int[0][0];
          }

          int[][] res = new int[m][n];

          for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                    res[i][j] = original[i * n + j];
               }
          }

          return res;
     }

     public static void main(String[] args) {

     }
}