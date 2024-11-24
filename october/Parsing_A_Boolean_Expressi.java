package october;

import java.util.Stack;

public class Parsing_A_Boolean_Expressi {
     public boolean parseBoolExpr(String expression) {
          Stack<Character> stack = new Stack<Character>();
          for (char c : expression.toCharArray()) {
               if (c != ')')
                    stack.push(c);
               else {
                    boolean hasTrue = false, hasFalse = false;
                    while (stack.peek() != '(') {
                         char ch = stack.pop();
                         if (ch == 'f')
                              hasFalse = true;
                         else if (ch == 't')
                              hasTrue = true;
                    }
                    stack.pop();
                    char symbol = stack.pop();
                    if (symbol == '&') {
                         if (hasFalse)
                              stack.push('f');
                         else
                              stack.push('t');
                    } else if (symbol == '|') {
                         if (hasTrue)
                              stack.push('t');
                         else
                              stack.push('f');
                    } else {
                         if (hasTrue)
                              stack.push('f');
                         else
                              stack.push('t');
                    }
               }
          }
          return (stack.pop() == 't') ? true : false;
     }

     public static void main(String[] args) {

     }
}