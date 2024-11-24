package october;

public class Binary_Tree_After_Subtree_Removal_Queries {
     private Map<Integer, Integer> leftMap = new HashMap<>();
     private Map<Integer, Integer> rightMap = new HashMap<>();
     private Map<Integer, Integer> removed = new HashMap<>();

     public int[] treeQueries(TreeNode root, int[] queries) {
          populateHeights(root, 0);
          calculateRemovedHeights(root, 0);

          int[] output = new int[queries.length];
          for (int i = 0; i < queries.length; i++) {
               output[i] = removed.get(queries[i]);
          }
          return output;
     }

     // height is the max tree height with this node removed
     private void calculateRemovedHeights(TreeNode node, int height) {
          if (node == null) {
               return;
          }
          removed.put(node.val, height);

          // for each child, the height when removed is the max of the the height
          // following
          // the opposite child, or the passed-in height with this node removed
          calculateRemovedHeights(node.left, Math.max(height, rightMap.get(node.val)));
          calculateRemovedHeights(node.right, Math.max(height, leftMap.get(node.val)));
     }

     // populate the maps with the total height of the left and right subtree of
     // each node, and return the larger of the two values
     private int populateHeights(TreeNode node, int height) {
          if (node == null) {
               return height - 1;
          }

          leftMap.put(node.val, populateHeights(node.left, height + 1));
          rightMap.put(node.val, populateHeights(node.right, height + 1));

          return Math.max(leftMap.get(node.val), rightMap.get(node.val));
     }

     public static void main(String[] args) {

     }
}