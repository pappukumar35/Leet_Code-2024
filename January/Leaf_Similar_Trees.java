import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

class Leaf_Similar_Trees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        helper(list1, root1);
        helper(list2, root2);

        if (list1.equals(list2))
            return true;
        else
            return false;
    }

    private void helper(List<Integer> list, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        } else {
            helper(list, root.left);
            helper(list, root.right);
        }
    }
}