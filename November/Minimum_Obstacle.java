package November;

import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Minimum_Obstacle {
     private static final int[] d = { 0, 1, 0, -1, 0 };

     public int minimumObstacles(int[][] grid) {
          int n = grid.length, m = grid[0].length;
          int[] dist = new int[n * m];
          Arrays.fill(dist, Integer.MAX_VALUE);
          Deque<int[]> deque = new ArrayDeque<>();
          dist[0] = 0;
          deque.offerFirst(new int[] { 0, 0 });
          while (!deque.isEmpty()) {
               int[] current = deque.pollFirst();
               int d1 = current[0], idx = current[1];
               int i = idx / m, j = idx % m;
               if (i == n - 1 && j == m - 1)
                    return d1;
               for (int a = 0; a < 4; ++a) {
                    int r = i + d[a], c = j + d[a + 1];
                    if (r < 0 || r >= n || c < 0 || c >= m)
                         continue;
                    int d2 = d1 + grid[r][c];
                    int idx2 = r * m + c;
                    if (d2 < dist[idx2]) {
                         dist[idx2] = d2;
                         if (grid[r][c] == 0) {
                              deque.offerFirst(new int[] { d2, idx2 });
                         } else {
                              deque.offerLast(new int[] { d2, idx2 });
                         }
                    }
               }
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}