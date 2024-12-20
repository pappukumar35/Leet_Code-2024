package December;

public class Odd_Levels_of_Binary_Tree {
     public TreeNode reverseOddLevels(TreeNode root) {
          DFS(root.left, root.right, 0);
          return root;
     }

     private void DFS(TreeNode leftChild, TreeNode rightChild, int level) {
          if (leftChild == null || rightChild == null) {
               return;
          }
          if (level % 2 == 0) {
               int temp = leftChild.val;
               leftChild.val = rightChild.val;
               rightChild.val = temp;
          }
          DFS(leftChild.left, rightChild.right, level + 1);
          DFS(leftChild.right, rightChild.left, level + 1);
     }

     public static void main(String args[]) {

     }
}