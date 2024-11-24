package July;

import java.util.*;

public class Lucky_Numbers_in_a_Matrix {
     public List<Integer> luckyNumbers(int[][] matrix) {
          int N = matrix.length, M = matrix[0].length;

          List<Integer> rowMin = new ArrayList<>();
          for (int i = 0; i < N; i++) {
               int rMin = Integer.MAX_VALUE;
               for (int j = 0; j < M; j++) {
                    rMin = Math.min(rMin, matrix[i][j]);
               }
               rowMin.add(rMin);
          }

          List<Integer> colMax = new ArrayList<>();
          for (int i = 0; i < M; i++) {
               int cMax = Integer.MIN_VALUE;
               for (int j = 0; j < N; j++) {
                    cMax = Math.max(cMax, matrix[j][i]);
               }
               colMax.add(cMax);
          }

          List<Integer> luckyNumbers = new ArrayList<>();
          for (int i = 0; i < N; i++) {
               for (int j = 0; j < M; j++) {
                    if (matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)) {
                         luckyNumbers.add(matrix[i][j]);
                    }
               }
          }

          return luckyNumbers;
     }

     public static void main(String[] args) {

     }
}