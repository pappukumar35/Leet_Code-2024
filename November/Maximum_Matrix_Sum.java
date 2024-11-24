package November;

public class Maximum_Matrix_Sum {
     public long maxMatrixSum(int[][] matrix) {
          int neg = 0;
          long sum = 0;
          long minVal = Long.MAX_VALUE;

          for (int[] row : matrix) {
               for (int val : row) {
                    if (val < 0) {
                         neg++;
                    }
                    sum += Math.abs(val);
                    minVal = Math.min(minVal, Math.abs(val));
               }
          }

          if (neg % 2 == 1) {
               sum -= 2 * minVal;
          }

          return sum;
     }

     public static void main(String[] args) {

     }
}