package May;

import java.util.*;

public class Distribute_Coins_in_Binary_Tree {
     class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode() {
          }

          TreeNode(int val) {
               this.val = val;
          }

          TreeNode(int val, TreeNode left, TreeNode right) {
               this.val = val;
               this.left = left;
               this.right = right;
          }
     }

     class Solution {
          private int moves = 0;

          private int dfs(TreeNode node) {
               if (node == null)
                    return 0;
               int left_excess = dfs(node.left);
               int right_excess = dfs(node.right);
               moves += Math.abs(left_excess) + Math.abs(right_excess);
               return node.val + left_excess + right_excess - 1;
          }

          public int distributeCoins(TreeNode root) {
               dfs(root);
               return moves;
          }

          public static void main(String[] args) {

          }

     }
}