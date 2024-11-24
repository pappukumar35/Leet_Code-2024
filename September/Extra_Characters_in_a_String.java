package September;

public class Extra_Characters_in_a_String {
     public int minExtraChar(String s, String[] dictionary) {
          return recursion(s, 0, s.length(), dictionary, new Integer[s.length()]);
     }

     public int recursion(String str, int index, int n, String[] dict, Integer[] dp) {
          if (index == n) {
               return 0;
          }

          if (dp[index] != null) {
               return dp[index];
          }

          int min = Integer.MAX_VALUE;
          for (String i : dict) {
               int len = i.length();
               if (index + len <= n && str.substring(index, index + len).equals(i)) {
                    min = Math.min(min, recursion(str, index + len, n, dict, dp));
               }
          }

          return dp[index] = Math.min(min, 1 + recursion(str, index + 1, n, dict, dp));
     }

     public static void main(String[] args) {

     }
}
