package December;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_by_Level {
     public int minSwapsToSort(int[] arr) {
          int n = arr.length;
          int[][] indexedArr = new int[n][2];
          for (int i = 0; i < n; i++) {
               indexedArr[i][0] = arr[i];
               indexedArr[i][1] = i;
          }
          Arrays.sort(indexedArr, (a, b) -> Integer.compare(a[0], b[0]));
          boolean[] visited = new boolean[n];
          int swaps = 0;

          for (int i = 0; i < n; i++) {
               if (visited[i] || indexedArr[i][1] == i) {
                    continue;
               }

               int cycleSize = 0;
               int j = i;
               while (!visited[j]) {
                    visited[j] = true;
                    j = indexedArr[j][1];
                    cycleSize++;
               }

               if (cycleSize > 1) {
                    swaps += cycleSize - 1;
               }
          }

          return swaps;
     }

     public int minimumOperations(TreeNode root) {
          if (root == null)
               return 0;

          Queue<TreeNode> q = new LinkedList<>();
          q.add(root);
          int operations = 0;

          while (!q.isEmpty()) {
               int levelSize = q.size();
               int[] level = new int[levelSize];
               for (int i = 0; i < levelSize; i++) {
                    TreeNode node = q.poll();
                    level[i] = node.val;

                    if (node.left != null)
                         q.add(node.left);
                    if (node.right != null)
                         q.add(node.right);
               }
               operations += minSwapsToSort(level);
          }

          return operations;
     }

     public static void main(String[] args) {

     }
}