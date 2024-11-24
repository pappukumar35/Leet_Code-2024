package May;

import java.util.*;
import java.util.*;

public class Palindrome_Partitioning {

     public List<List<String>> partition(String s) {
          List<List<String>> result = new ArrayList<>();
          List<String> curr = new ArrayList<>();
          int lenS = s.length();

          explore(0, s, curr, result, lenS);
          return result;
     }

     private void explore(int index, String s, List<String> curr, List<List<String>> result, int lenS) {
          if (index >= lenS) {
               result.add(new ArrayList<>(curr));
               return;
          }

          for (int i = index; i < lenS; ++i) {
               String subStr = s.substring(index, i + 1);
               if (isPalindrome(subStr)) {
                    curr.add(subStr);
                    explore(i + 1, s, curr, result, lenS);
                    curr.remove(curr.size() - 1);
               }
          }
     }

     private boolean isPalindrome(String s) {
          int left = 0, right = s.length() - 1;
          while (left < right) {
               if (s.charAt(left) != s.charAt(right))
                    return false;
               left++;
               right--;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}