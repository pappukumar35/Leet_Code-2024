import java.io.*;
import java.util.*;

class Count_Subarrays_Where_Max _Element_Appears_at_Least_K_Times{

     public long countSubarrays(int[] nums, int k) {
          long maxNum = Long.MIN_VALUE, count = 0;
          long left = 0, right = 0, ans = 0;

          // Find the maximum element in the array
          for (int num : nums) {
               maxNum = Math.max(maxNum, num);
          }

          while (right < nums.length || left > right) {
               if (nums[(int) right] == maxNum) {
                    count++;
               }
               // If count is greater than or equal to k, calculate subarrays count
               while (count >= k) {
                    if (nums[(int) left] == maxNum) {
                         count--;
                    }
                    left++;
                    ans += nums.length - right;
               }
               right++;
          }
          return ans;
     }

     public static void main(String args[]) {

     }

}