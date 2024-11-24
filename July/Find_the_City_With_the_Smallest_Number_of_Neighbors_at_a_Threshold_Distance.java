package July;

import java.util.*;

public class Find_the_City_With_the_Smallest_Number_of_Neighbors_at_a_Threshold_Distance {
     public int findTheCity(int n, int[][] edges, int distanceThreshold) {
          // Initialize the distance matrix with a large value (infinity).
          int[][] dist = new int[n][n];
          for (int[] row : dist) {
               Arrays.fill(row, 10001); // 10001 is larger than the maximum possible threshold
          }

          // Distance to self is 0
          for (int i = 0; i < n; i++) {
               dist[i][i] = 0;
          }

          // Populate the initial distances based on the edges
          for (int[] edge : edges) {
               int from = edge[0];
               int to = edge[1];
               int weight = edge[2];
               dist[from][to] = weight;
               dist[to][from] = weight;
          }

          // Floyd-Warshall algorithm to find shortest paths between all pairs of nodes
          for (int k = 0; k < n; k++) {
               for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                         if (dist[i][k] + dist[k][j] < dist[i][j]) {
                              dist[i][j] = dist[i][k] + dist[k][j];
                         }
                    }
               }
          }

          // Find the city with the smallest number of reachable cities within the
          // distance threshold
          int minReachableCities = Integer.MAX_VALUE;
          int city = -1;

          for (int i = 0; i < n; i++) {
               int reachableCities = 0;
               for (int j = 0; j < n; j++) {
                    if (dist[i][j] <= distanceThreshold) {
                         reachableCities++;
                    }
               }

               // If the number of reachable cities is smaller or if the number is the same
               // but the city index is greater, update the result
               if (reachableCities <= minReachableCities) {
                    minReachableCities = reachableCities;
                    city = i;
               }
          }

          return city;
     }

     public static void main(String[] args) {

     }
}