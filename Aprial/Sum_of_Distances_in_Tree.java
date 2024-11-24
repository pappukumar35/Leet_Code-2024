package Aprial;

import java.util.*;
import java.util.*;

public class Sum_of_Distances_in_Tree {
     List<List<Integer>> tree;
     int[] count;
     int[] ans;

     public int[] sumOfDistancesInTree(int n, int[][] edges) {
          tree = new ArrayList<>();
          count = new int[n];
          ans = new int[n];

          // Initialize adjacency list representation of the tree
          for (int i = 0; i < n; i++) {
               tree.add(new ArrayList<>());
          }
          for (int[] edge : edges) {
               int u = edge[0], v = edge[1];
               tree.get(u).add(v);
               tree.get(v).add(u);
          }

          dfs(0, -1); // Calculate subtree sizes and initial answers
          dfs2(0, -1); // Calculate answers for each node

          return ans;
     }

     // Calculate subtree sizes and initial answers
     private void dfs(int node, int parent) {
          count[node] = 1;
          for (int child : tree.get(node)) {
               if (child != parent) {
                    dfs(child, node);
                    count[node] += count[child];
                    ans[node] += ans[child] + count[child];
               }
          }
     }

     // Calculate answers for each node
     private void dfs2(int node, int parent) {
          for (int child : tree.get(node)) {
               if (child != parent) {
                    ans[child] = ans[node] - count[child] + count.length - count[child];
                    dfs2(child, node);
               }
          }
     }

     public static void main(String[] args) {

     }

}