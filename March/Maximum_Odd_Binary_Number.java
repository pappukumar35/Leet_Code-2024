class Maximum_Odd_Binary_Number {
     public String maximumOddBinaryNumber(String s) {
          int n = s.length();
          int cnt1 = 0;

          // Count the number of '1's in the input string
          for (int i = 0; i < n; i++) {
               if (s.charAt(i) == '1') {
                    cnt1++;
               }
          }

          // Initialize result string with '0's
          StringBuilder res = new StringBuilder();
          for (int i = 0; i < n; i++) {
               res.append('0');
          }

          // Set the last character to '1' to ensure the number is odd
          res.setCharAt(n - 1, '1');

          // Fill the beginning of the string with '1's, based on the count minus 1
          // (since one '1' is already placed at the end)
          for (int i = 0; i < cnt1 - 1; i++) {
               res.setCharAt(i, '1');
          }

          return res.toString();
     }

     public static void main(String[] args) {

     }
}