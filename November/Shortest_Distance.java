package November;

import java.util.*;

public class Shortest_Distance {
     private int BFS(int n, int[][] qureies, Map<Integer, List<Integer>> adV) {
          Queue<Integer> q = new LinkedList<>();
          q.add(0);
          boolean[] visited = new boolean[n];
          visited[0] = true;
          int d = 0;
          while (!q.isEmpty()) {
               int l = q.size();
               for (int i = 0; i < l; i++) {
                    int node = q.poll();
                    for (int j : adV.get(node)) {
                         if (!visited[j]) {
                              q.add(j);
                              visited[j] = true;
                         }
                    }
               }
               d++;
               if (q.contains(n - 1)) {
                    return d;
               }
          }
          return -1;
     }

     public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
          Map<Integer, List<Integer>> adV = new HashMap<>();
          for (int i = 0; i < n; i++) {
               adV.put(i, new ArrayList<>());
               if (i < n - 1) {
                    adV.get(i).add(i + 1);
               }
          }
          List<Integer> result = new ArrayList<>();
          for (int[] query : queries) {
               int u = query[0], v = query[1];
               adV.get(u).add(v);
               result.add(BFS(n, queries, adV));
          }
          int[] intArray = new int[result.size()];
          for (int i = 0; i < result.size(); i++) {
               intArray[i] = result.get(i);
          }
          return intArray;
     }

     public static void main(String[] args) {

     }
}