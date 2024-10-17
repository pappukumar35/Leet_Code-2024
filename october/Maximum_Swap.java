package october;

public class Maximum_Swap {

     public int maximumSwap(int num) {
          char[] digits = Integer.toString(num).toCharArray();

          int[] last = new int[10];

          for (int i = 0; i < digits.length; i++) {
               last[digits[i] - '0'] = i;
          }

          for (int i = 0; i < digits.length; i++) {

               for (int d = 9; d > digits[i] - '0'; d--) {
                    if (last[d] > i) {
                         char temp = digits[i];
                         digits[i] = digits[last[d]];
                         digits[last[d]] = temp;

                         return Integer.parseInt(new String(digits));
                    }
               }
          }
          return num;
     }

     public static void main(String[] args) {

     }
}