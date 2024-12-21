
import java.util.ArrayList;
import java.util.List;

public class Divisible_Components {

     public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
          List<Integer> graph[] = new ArrayList[n];
          for (int i = 0; i < n; i++)
               graph[i] = new ArrayList<Integer>();
          for (int edge[] : edges) {
               int u = edge[0];
               int v = edge[1];
               graph[u].add(v);
               graph[v].add(u);
          }
          int res[] = solve(graph, new boolean[n], values, k, 0);
          return res[1];
     }

     private int[] solve(List<Integer> graph[], boolean vis[], int values[], int k, int curr) {
          vis[curr] = true;
          int components = 0, componentsSum = 0;
          for (int neigbor : graph[curr]) {
               if (vis[neigbor])
                    continue;
               int res[] = solve(graph, vis, values, k, neigbor);
               components += res[1];
               componentsSum += res[0];
          }
          componentsSum += values[curr];
          if (componentsSum % k == 0)
               components++;
          return new int[] { componentsSum % k, components };
     }

     public static void main(String args[]) {

     }
}