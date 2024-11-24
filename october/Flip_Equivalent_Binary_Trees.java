package october;

public class Flip_Equivalent_Binary_Trees {
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

     private boolean dfs(TreeNode node1, TreeNode node2) {
          if (node1 == null && node2 == null)
               return true;
          if (node1 == null || node2 == null)
               return false;
          return node1.val == node2.val &&
                    ((dfs(node1.left, node2.left) && dfs(node1.right, node2.right)) ||
                              (dfs(node1.left, node2.right) && dfs(node1.right, node2.left)));
     }

     public boolean flipEquiv(TreeNode root1, TreeNode root2) {
          return dfs(root1, root2);
     }

     public static void main(String[] args) {

     }
}