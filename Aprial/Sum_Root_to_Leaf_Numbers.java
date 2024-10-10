package Aprial;

import java.util.*;

public class Sum_Root_to_Leaf_Numbers {
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

     int totalSum = 0; // Variable to store the total sum

     // Recursive function to calculate the sum of numbers formed by root to leaf
     // paths
     void sumNumbersHelper(TreeNode root, int currentSum) {
          // Base case: if the node is a leaf node
          if (root.left == null && root.right == null) {
               // Add the sum formed by the path from root to leaf to the total sum
               totalSum += currentSum * 10 + root.val;
               return;
          }
          // Update the current sum by appending the current node's value
          currentSum *= 10;
          currentSum += root.val;
          // Recursively traverse the left and right subtrees if they are available
          if (root.left != null)
               sumNumbersHelper(root.left, currentSum);
          if (root.right != null)
               sumNumbersHelper(root.right, currentSum);
     }

     // Function to calculate the sum of numbers formed by root to leaf paths
     public int sumNumbers(TreeNode root) {
          // Start the recursive function with initial sum 0
          sumNumbersHelper(root, 0);
          // Return the total sum
          return totalSum;
     }

     public static void main(String[] args) {

     }
}