
package Aprial;

import java.util.*;

public class Smallest_String_Starting_From_Leaf {
     String res = "";

     public String sm(TreeNode root, String sum) {
          if (root == null)
               return "";
          sum = (char) (root.val + 97) + sum;
          if (root.left == null && root.right == null) {
               // int q=Integer.parseInt(sum);
               if (res == "")
                    res = sum;
               if (res.compareTo(sum) > 0)
                    res = sum;
          }
          sm(root.left, sum);
          sm(root.right, sum);
          return res;
     }

     public String smallestFromLeaf(TreeNode root) {
          return sm(root, "");

     }

     public static void main(String[] args) {

     }
}