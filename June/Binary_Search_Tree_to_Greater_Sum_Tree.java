package June;

import java.util.*;

public class Binary_Search_Tree_to_Greater_Sum_Tree {
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

     public void check(TreeNode r, List<Integer> l) {
          if (r == null) {
               return;
          }
          check(r.right, l);
          int k = 0;
          l.add(r.val);
          for (int i = 0; i < l.size(); i++) {
               k = k + l.get(i);
          }
          r.val = k;
          check(r.left, l);
     }

     public TreeNode bstToGst(TreeNode root) {
          List<Integer> l = new ArrayList<>();
          check(root, l);
          System.out.print(l);
          return root;
     }

     public static void main(String[] args) {

     }
}