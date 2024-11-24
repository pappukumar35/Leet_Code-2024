package Aprial;

import java.io.*;
import java.util.*;

public class Sum_of_Left_Leaves {
     public int sumOfLeftLeaves(TreeNode root) {
          if (root == null)
               return 0;

          else if (root.left != null && root.left.left == null & root.left.right == null) {
               return root.left.val + sumOfLeftLeaves(root.right);
          } else {
               return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
          }
     }

     public static void main(String[] args) {

     }
}