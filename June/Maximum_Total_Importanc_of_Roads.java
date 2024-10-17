package June;

import java.util.*;
import java.util.*;

public class Maximum_Total_Importanc_of_Roads {
     public long maximumImportance(int n, int[][] roads) {
          int[] degree = new int[n];
          for (int[] road : roads) {
               degree[road[0]]++;
               degree[road[1]]++;
          }

          Integer[] cities = new Integer[n];
          for (int i = 0; i < n; i++) {
               cities[i] = i;
          }
          Arrays.sort(cities, (a, b) -> Integer.compare(degree[b], degree[a]));

          int[] values = new int[n];
          int currentValue = n;
          for (int city : cities) {
               values[city] = currentValue--;
          }

          long totalImportance = 0;
          for (int[] road : roads) {
               totalImportance += values[road[0]] + values[road[1]];
          }

          return totalImportance;
     }

     public static void main(String[] args) {

     }
}