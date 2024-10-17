package Aprial;

import java.util.*;
import java.util.*;

public class Find_All_Groups_of_Farmland {
     public int[][] findFarmland(int[][] land) {

          int n = land.length;
          int m = land[0].length;

          List<int[]> ans = new ArrayList<>();

          for (int r1 = 0; r1 < n; r1++) {
               for (int c1 = 0; c1 < m; c1++) {
                    if (land[r1][c1] == 1) {
                         int r2 = r1, c2 = c1;

                         for (r2 = r1; r2 < n && land[r2][c1] == 1; r2++) {
                              for (c2 = c1; c2 < m && land[r2][c2] == 1; c2++) {
                                   land[r2][c2] = 0;
                              }
                         }

                         ans.add(new int[] { r1, c1, r2 - 1, c2 - 1 });
                    }
               }
          }

          return ans.toArray(new int[ans.size()][]);
     }

     public static void main(String[] args) {

     }
}