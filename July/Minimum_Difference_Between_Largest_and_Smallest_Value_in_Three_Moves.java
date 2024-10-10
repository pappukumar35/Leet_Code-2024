package July;

import java.util.*;
import java.util.*;

public class Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves {
     public int minDifference(int[] nums) {
          if (nums.length <= 4) {
               return 0;
          }
          Arrays.sort(nums);
          int ans = nums[nums.length - 1] - nums[0];
          for (int i = 0; i <= 3; i++) {
               ans = Math.min(ans, nums[nums.length - (3 - i) - 1] - nums[i]);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}