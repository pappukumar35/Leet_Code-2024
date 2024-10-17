package July;

import java.util.*;

public class Reverse_Substrings_Between_Each_Pair_of_Parentheses {
     public String reverseParentheses(String s) {
          Deque<Integer> indStack = new LinkedList<>();
          StringBuilder res = new StringBuilder();

          for (char char_s : s.toCharArray()) {
               if (char_s == '(') {
                    indStack.push(res.length());
               } else if (char_s == ')') {
                    int startInd = indStack.pop();
                    String reversed = new StringBuilder(res.substring(startInd)).reverse().toString();
                    res.replace(startInd, res.length(), reversed);
               } else {
                    res.append(char_s);
               }
          }

          return res.toString();
     }

     public static void main(String[] args) {

     }
}