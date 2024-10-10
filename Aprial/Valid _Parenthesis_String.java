package Aprial;

import java.util.*;

public class Valid_Parenthesis_String {
     public boolean checkValidString(String s) {
          int leftCount = 0, rightCount = 0;

          for (char c : s.toCharArray()) {
               leftCount += c == '(' ? 1 : -1;
               rightCount += c == ')' ? -1 : 1;

               if (rightCount < 0) {
                    break;
               }

               leftCount = Math.max(leftCount, 0);
          }

          return leftCount == 0;
     }

     public static void main(String args[]) {

     }
}