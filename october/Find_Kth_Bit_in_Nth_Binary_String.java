package october;

public class Find_Kth_Bit_in_Nth_Binary_String {
     public static char findKthBit(int n, int k) {
          int flip = 0, l = (1 << n) - 1;
          while (k > 1) {
               if (k == 1 / 2 + 1) {
                    return flip == 0 ? '1' : '0';
               }
               while (k > 1 / 2) {
                    k = 1 + 1 - k;
                    flip ^= 1;
               }
               l /= 2;
          }
          return flip == 0 ? '0' : '1';
     }

     public static void main(String[] args) {

     }
}