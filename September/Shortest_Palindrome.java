package September;

public class Shortest_Palindrome {
     public String shortestPalindrome(String s) {
          char[] ch = s.toCharArray();

          int start = 0, end = s.length() - 1;
          int idx = end;
          while (start < end) {
               if (ch[start] == ch[end]) {
                    start++;
                    end--;
               } else {
                    start = 0;
                    end = --idx;
               }
          }
          return new StringBuilder(s.substring(idx + 1)).reverse().toString() + s;
     }

     public static void main(String[] args) {

     }
}