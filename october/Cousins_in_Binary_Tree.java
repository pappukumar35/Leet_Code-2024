package october;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cousins_in_Binary_Tree {
     public class TreeNode {
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

     public TreeNode replaceValueInTree(TreeNode root) {
          Queue<TreeNode> q = new LinkedList<>();
          q.add(root);
          while (!q.isEmpty()) {
               Queue<List<TreeNode>> tmp = new LinkedList<>();
               int sum = 0;
               while (!q.isEmpty()) {
                    TreeNode curr = q.remove();
                    List<TreeNode> list = new ArrayList<>();
                    if (curr.left != null) {
                         sum += curr.left.val;
                         list.add(curr.left);
                    }
                    if (curr.right != null) {
                         sum += curr.right.val;
                         list.add(curr.right);
                    }
                    tmp.add(list);
               }
               while (!tmp.isEmpty()) {
                    List<TreeNode> curr = tmp.remove();
                    int currSum = 0;
                    for (TreeNode node : curr) {
                         currSum += node.val;
                    }
                    for (TreeNode node : curr) {
                         node.val = sum - currSum;
                         q.add(node);
                    }
               }
          }
          root.val = 0;
          return root;

     }

     public static void main(String[] args) {

     }
}