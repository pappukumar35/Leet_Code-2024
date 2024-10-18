package September;

import java.util.List;

public class Minimum_Time_Difference {
     public int findMinDifference(List<String> timePoints) {

          int n = timePoints.size();
          int[] mins = new int[n];

          for (int i = 0; i < n; i++) {
               int h = Integer.parseInt(timePoints.get(i).substring(0, 2));
               int m = Integer.parseInt(timePoints.get(i).substring(3));

               mins[i] = h * 60 + m;
          }

          Arrays.sort(mins);
          int res = Integer.MAX_VALUE;
          for (int i = 0; i < n - 1; i++) {

               res = Math.min(res, mins[i + 1] - mins[i]);
          }

          res = Math.min(res, (24 * 60) - mins[n - 1] + mins[0]);

          return res;
     }

     public static void main(String[] args) {

     }
}