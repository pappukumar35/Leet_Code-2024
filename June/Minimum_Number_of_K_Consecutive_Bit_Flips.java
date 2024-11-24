package June;

import java.util.*;

public class Minimum_Number_of_K_Consecutive_Bit_Flips {
     public int minKBitFlips(int[] A, int K) {
          int n = A.length; // Length of the input array
          int flipped = 0; // Current flip state
          int res = 0; // Result to count the number of flips
          int[] isFlipped = new int[n]; // Auxiliary array to track flips

          for (int i = 0; i < A.length; ++i) {
               // Undo the effect of flips that were started K positions ago
               if (i >= K) {
                    flipped ^= isFlipped[i - K];
               }

               // If the current element is in the wrong state
               if (flipped == A[i]) {
                    // If there is not enough space to flip a subarray of length K, return -1
                    if (i + K > A.length) {
                         return -1;
                    }

                    // Record the flip at the current position
                    isFlipped[i] = 1;

                    // Update the current flip state
                    flipped ^= 1;

                    // Increment the number of flips
                    res++;
               }
          }

          return res;
     }

     public static void main(String[] args) {

     }
}