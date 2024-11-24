package June;

import java.util.*;

public class Subarray_Sums_Divisible_by_K {
     public int subarraysDivByK(int[] nums, int k) {
          int count = 0, sum = 0, rem, size = nums.length;
          int dp[] = new int[k];

          for (int i = 0; i < size; i++) {
               sum += nums[i];
               rem = sum % k;

               if (rem < 0) {
                    rem += k;
               }

               dp[rem]++;
          }

          for (int i = 0; i < k; i++) {
               if (dp[i] > 1) {
                    count += (dp[i] * (dp[i] - 1)) / 2;
               }
          }

          count += dp[0];
          return count;
     }

     public static void main(String[] args) {

     }
}