package December;

public class Subsequence_Using {
     public boolean canMakeSubsequence(String str1, String str2) {
          int m = str1.length();
          int n = str2.length();
          int j = 0;
          for (int i = 0; i < m && j < n; i++) {
               int a = str1.charAt(i);
               int b = str2.charAt(j);
               if (a == b || a + 1 == b || a - 25 == b) {
                    j++;
               }
          }
          if (j == n)
               return true;
          return false;
     }

     public static void main(String[] args) {

     }
}