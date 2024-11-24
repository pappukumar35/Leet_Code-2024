package october;

public class Count_Square_Submatrices_with_All_Ones {
     public int countSquares(int[][] matrix) {
          int rowSize = matrix.length;
          int colSize = matrix[0].length;

          for (int i = 1; i < rowSize; i++) {
               for (int j = 1; j < colSize; j++) {
                    if (matrix[i][j] == 1) {
                         matrix[i][j] += Math.min(matrix[i - 1][j],
                                   Math.min(matrix[i - 1][j - 1], matrix[i][j - 1]));
                    }
               }
          }

          int total = 0;
          for (int i = 0; i < rowSize; i++) {
               for (int j = 0; j < colSize; j++) {
                    total += matrix[i][j];
               }
          }

          return total;
     }

     public static void main(String[] args) {

     }
}