package June;

import java.util.*;

public class Balance_a_Binary_Search_Tree {
     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val) {
               this.val = val;
               this.left = left;
               this.right = right;
          }
     }

     List<Integer> list = new ArrayList<>();

     private void inOrder(TreeNode root) {
          if (root == null)
               return;

          inOrder(root.left);
          list.add(root.val);
          inOrder(root.right);
     }

     // Using Two Pointer Recursive Approach for finding and insertion at the
     // Tree.....
     private TreeNode BST(int start, int end) {
          if (start > end)
               return null;

          int mid = start + (end - start) / 2;

          TreeNode root = new TreeNode(list.get(mid));
          root.left = BST(start, mid - 1);
          root.right = BST(mid + 1, end);

          return root;
     }

     // Drive Code...
     public TreeNode balanceBST(TreeNode root) {
          inOrder(root);
          return BST(0, list.size() - 1);
     }

     public static void main(String[] args) {

     }
}