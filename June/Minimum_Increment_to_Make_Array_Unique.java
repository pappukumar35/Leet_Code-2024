package June;

import java.util.*;
import java.util.*;

public class Minimum_Increment_to_Make_Array_Unique {
     public int minIncrementForUnique(int[] nums) {
          Arrays.sort(nums);
          int ans = 0;
          for (int i = 1; i < nums.length; i++) {
               if (nums[i] <= nums[i - 1]) {
                    ans += nums[i - 1] - nums[i] + 1;
                    nums[i] = nums[i - 1] + 1;
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}