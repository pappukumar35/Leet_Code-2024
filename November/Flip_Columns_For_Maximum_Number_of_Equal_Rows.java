package November;

import java.util.*;

public class Flip_Columns_For_Maximum_Number_of_Equal_Rows {
     public int maxEqualRowsAfterFlips(int[][] matrix) {

          HashMap<String, Integer> map = new HashMap<>();
          int sameRows = 0;

          for (int i = 0; i < matrix.length; i++) {
               StringBuilder sb = new StringBuilder("*");
               for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] != matrix[i][j - 1])
                         sb.append(" *");
                    else
                         sb.append("*");
               }
               String str = sb.toString();
               map.put(str, map.getOrDefault(str, 0) + 1);
               sameRows = Math.max(sameRows, map.get(str));
          }

          return sameRows;
     }

     public static void main(String[] args) {

     }
}