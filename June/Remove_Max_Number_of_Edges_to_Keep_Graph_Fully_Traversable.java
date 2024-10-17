package June;

import java.util.*;

public class Remove_Max_Number_of_Edges_to_Keep_Graph_Fully_Traversable {
     public int maxNumEdgesToRemove(int n, int[][] edges) {
          UnionFind alice = new UnionFind(n);
          UnionFind bob = new UnionFind(n);

          int edgesRequired = 0;
          // First process type 3 edges
          for (int[] edge : edges) {
               if (edge[0] == 3) {
                    edgesRequired += (alice.preformUnion(edge[1], edge[2]) | bob.preformUnion(edge[1], edge[2]));
               }
          }

          // Process type 2 and type 1 edges
          for (int[] edge : edges) {
               if (edge[0] == 2) {
                    edgesRequired += bob.preformUnion(edge[1], edge[2]);
               } else if (edge[0] == 1) {
                    edgesRequired += alice.preformUnion(edge[1], edge[2]);
               }
          }

          // Check if both Alice's and Bob's graphs are fully connected
          if (alice.isConnected() && bob.isConnected()) {
               return edges.length - edgesRequired;
          }

          return -1;
     }

     class UnionFind {
          int[] representative;
          int[] componentSize;
          int components;

          UnionFind(int n) {
               components = n;
               representative = new int[n + 1];
               componentSize = new int[n + 1];

               for (int i = 0; i <= n; i++) {
                    representative[i] = i;
                    componentSize[i] = 1;
               }
          }

          int findRepresentative(int x) {
               if (representative[x] == x) {
                    return x;
               }
               return representative[x] = findRepresentative(representative[x]);
          }

          int preformUnion(int x, int y) {
               x = findRepresentative(x);
               y = findRepresentative(y);

               if (x == y) {
                    return 0;
               }

               if (componentSize[x] > componentSize[y]) {
                    componentSize[x] += componentSize[y];
                    representative[y] = x;
               } else {
                    componentSize[y] += componentSize[x];
                    representative[x] = y;
               }

               components--;
               return 1;
          }

          boolean isConnected() {
               return components == 1;
          }
     }

     public static void main(String[] args) {

     }
}