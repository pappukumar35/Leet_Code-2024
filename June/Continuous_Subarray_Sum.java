package June;

import java.util.*;
import java.util.*;

public class Continuous_Subarray_Sum {
     public boolean checkSubarraySum(int[] nums, int k) {
          // Map to store the remainders and their corresponding index
          Map<Integer, Integer> remaindersFound = new HashMap<>();
          int currSum = 0;
          remaindersFound.put(0, -1); // To handle the case when subarray starts from index 0

          for (int i = 0; i < nums.length; i++) {
               currSum += nums[i];
               int remainder = currSum % k;

               if (remaindersFound.containsKey(remainder)) {
                    // Check if the length of the subarray is at least 2
                    if (i - remaindersFound.get(remainder) >= 2) {
                         return true;
                    }
               } else {
                    remaindersFound.put(remainder, i);
               }
          }

          return false;
     }

     public static void main(String[] args) {

     }
}