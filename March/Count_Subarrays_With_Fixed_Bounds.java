import java.io.*;
import java.util.*;

class Count_Subarrays_With_Fixed_Bounds {
     public long countSubarrays(int[] nums, int minK, int maxK) {

          long ans = 0;
          int badi = -1, mini = -1, maxi = -1, n = nums.length;

          for (int i = 0; i < n; i++) {
               if (nums[i] < minK || nums[i] > maxK)
                    badi = i;
               if (nums[i] == minK)
                    mini = i;
               if (nums[i] == maxK)
                    maxi = i;

               ans += Math.max(0, Math.min(mini, maxi) - badi);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}