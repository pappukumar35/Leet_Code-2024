import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Find_Bottom_Left_Tree_Value {
     public int findBottomLeftValue(TreeNode root) {
          int last = 0;
          Queue<TreeNode> q = new LinkedList<>();
          q.add(root);

          while (!q.isEmpty()) {
               int count = q.size();
               for (int i = 0; i < count; i++) {
                    TreeNode curr = q.poll();
                    if (i == 0)
                         last = curr.val; // last leftMost val
                    if (curr.left != null)
                         q.add(curr.left);
                    if (curr.right != null)
                         q.add(curr.right);
               }
          }
          return last;
     }

     public static void main(String[] args) {

     }
}