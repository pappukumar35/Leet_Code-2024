package June;

import java.util.*;
import java.util.*;

public class All_Ancestors_of_a_Node_in_a_Directed_Acyclic_Graph {
     public List<List<Integer>> getAncestors(int n, int[][] edges) {
          List<Set<Integer>> map = new ArrayList<>();
          List<List<Integer>> res = new ArrayList<>();
          boolean[] visited = new boolean[n];

          for (int i = 0; i < n; i++) {
               map.add(new HashSet<>());
               res.add(new ArrayList<>());
          }

          for (int[] edge : edges) {
               map.get(edge[0]).add(edge[1]);
          }

          for (int i = 0; i < n; i++) {
               Arrays.fill(visited, false);
               dfs(i, i, map, res, visited);
          }

          return res;
     }

     private void dfs(int v, int p, List<Set<Integer>> map, List<List<Integer>> res, boolean[] visited) {
          visited[v] = true;
          if (v != p)
               res.get(v).add(p);
          for (int x : map.get(v)) {
               if (!visited[x]) {
                    dfs(x, p, map, res, visited);
               }
          }
     }

     public static void main(String[] args) {

     }
}