package September;

import java.util.*;

public class Linked_List_in_Binary_Tree {
     public class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
               this.val = val;
          }

          ListNode(int val, ListNode next) {
               this.val = val;
               this.next = next;
          }

     }

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

     public boolean isSubPath(ListNode head, TreeNode root) {
          if (root == null)
               return false;
          if (dfs(root, head))
               return true;
          return isSubPath(head, root.left) || isSubPath(head, root.right);
     }

     public boolean dfs(TreeNode node, ListNode head) {
          if (head == null)
               return true;
          if (node == null || node.val != head.val)
               return false;
          return dfs(node.left, head.next) || dfs(node.right, head.next);
     }

     public static void main(String[] args) {

     }
}