package october;

import java.util.Stack;

public class Minimum_Number_of_Swaps_to_Make_the_String_Balanced {
     public int minSwaps(String s) {
          Stack<Character> stack = new Stack<>();
          for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);
               if (ch == '[') {
                    stack.push(ch);
               } else {
                    if (stack.isEmpty() || stack.peek() == ']') {
                         stack.push(ch);
                    } else {
                         stack.pop();
                    }
               }
          }
          int totalBrackets = stack.size();
          int closeBrackets = totalBrackets / 2;
          return (closeBrackets + 1) / 2;
     }

     public static void main(String[] args) {

     }
}