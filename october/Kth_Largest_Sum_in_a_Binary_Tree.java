package october;

public class Kth_Largest_Sum_in_a_Binary_Tree {
     long[] level_sum = new long[100001];
     int max_ind = -1;

     void dfs(TreeNode root, int level) {
          if (root == null)
               return;
          max_ind = Math.max(max_ind, level);
          level_sum[level] += root.val;

          dfs(root.left, level + 1);
          dfs(root.right, level + 1);
     }

     public long kthLargestLevelSum(TreeNode root, int k) {
          dfs(root, 0);
          max_ind++;
          if (max_ind < k)
               return -1;
          Arrays.sort(level_sum, 0, max_ind);
          return level_sum[max_ind - k];
     }

     public static void main(String[] args) {

     }
}