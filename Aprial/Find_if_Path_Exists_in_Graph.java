package Aprial;

import java.util.*;

public class Find_if_Path_Exists_in_Graph {
     public UnionFind(int n) {
          id = new int[n];
          rank = new int[n];
          for (int i = 0; i < n; ++i)
            id[i] = i;
        }

     public void unionByRank(int u, int v) {
          final int i = find(u);
          final int j = find(v);
          if (i == j)
               return;
          if (rank[i] < rank[j]) {
               id[i] = j;
          } else if (rank[i] > rank[j]) {
               id[j] = i;
          } else {
               id[i] = j;
               ++rank[j];
          }
     }

     public int find(int u) {
          return id[u] == u ? u : (id[u] = find(id[u]));
     }

     private int[] id;
     private int[] rank;
}

class Solution {
     public boolean validPath(int n, int[][] edges, int source, int destination) {
          UnionFind uf = new UnionFind(n);

          for (int[] edge : edges) {
               final int u = edge[0];
               final int v = edge[1];
               uf.unionByRank(u, v);
          }

          return uf.find(source) == uf.find(destination);
     }

     public static void main(String[] args) {

     }
}