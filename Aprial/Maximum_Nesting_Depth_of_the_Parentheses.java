package Aprial;

import java.util.*;

public class Maximum_Nesting_Depth_of_the_Parentheses {
     public int maxDepth(String s) {
          // Initializing variables to keep track of depth and count of open parentheses.
          int depth = 0; // Represents the maximum depth of nested parentheses encountered.
          int count = 0; // Keeps track of the number of open parentheses encountered.

          // Iterating through each character in the string.
          for (int i = 0; i < s.length(); i++) {
               // If the character is an open parenthesis '(',
               // increment the count of open parentheses encountered.
               if (s.charAt(i) == '(') {
                    count++;
               }

               // Update the depth with the maximum of the current depth and the count of open
               // parentheses.
               depth = Math.max(depth, count);

               // If the character is a closing parenthesis ')',
               // decrement the count of open parentheses encountered.
               if (s.charAt(i) == ')') {
                    count--;
               }
          }

          // Return the maximum depth found.
          return depth;
     }

     public static void main(String[] args) {

     }
}
