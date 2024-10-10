package June;

import java.util.*;

public class Longest_Palindrome {
     public int longestPalindrome(String s) {
          int res = 0, odd = 0, freq[] = new int[127];
          for (char c : s.toCharArray())
               freq[c]++;
          for (int num : freq) {
               if (num == 0)
                    continue;
               res += num - (num % 2 == 1 ? odd : 0);
               odd = (num % 2 == 1 ? 1 : odd);
          }
          return res;
     }

     public static void main(String args[]) {

     }
}