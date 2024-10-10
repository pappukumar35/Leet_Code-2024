package September;

public class Minimum_Bit_Flips_to_Convert_Number {
     public int minBitFlips(int start, int goal) {
          return Integer.bitCount(start ^ goal);
     }

     public static void main(String[] args) {

     }

}