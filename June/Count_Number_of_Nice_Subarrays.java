package June;

import java.util.*;
import java.util.*;

public class Count_Number_of_Nice_Subarrays {
     public int numberOfSubarrays(int[] nums, int k) {
          for (int i = 0; i < nums.length; i++) {
               nums[i] %= 2;
          }

          int[] prefixCount = new int[nums.length + 1];
          prefixCount[0] = 1;
          int s = 0;
          int ans = 0;

          for (int num : nums) {
               s += num;
               if (s >= k) {
                    ans += prefixCount[s - k];
               }
               prefixCount[s]++;
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}