package September;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Different_Ways_to_Add_Parentheses {
     private Map<String, List<Integer>> memo = new HashMap<>();

     public List<Integer> diffWaysToCompute(String expression) {
          if (memo.containsKey(expression)) {
               return memo.get(expression);
          }

          List<Integer> result = new ArrayList<>();

          if (expression.matches("-?\\d+")) { // Check if expression is a number
               result.add(Integer.parseInt(expression));
               return result;
          }

          for (int i = 0; i < expression.length(); i++) {
               char op = expression.charAt(i);
               if (op == '+' || op == '-' || op == '*') {
                    String leftExpr = expression.substring(0, i);
                    String rightExpr = expression.substring(i + 1);

                    List<Integer> leftResults = diffWaysToCompute(leftExpr);
                    List<Integer> rightResults = diffWaysToCompute(rightExpr);

                    for (int left : leftResults) {
                         for (int right : rightResults) {
                              if (op == '+')
                                   result.add(left + right);
                              else if (op == '-')
                                   result.add(left - right);
                              else if (op == '*')
                                   result.add(left * right);
                         }
                    }
               }
          }

          memo.put(expression, result);
          return result;
     }

     public static void main(String[] args) {

     }
}