package June;

import java.util.*;
import java.util.*;

public class Longest_Continuous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_to_Limit {
     public int longestSubarray(int[] nums, int limit) {
          PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);
          PriorityQueue<Integer> min = new PriorityQueue<>((a, b) -> nums[a] - nums[b]);
          int left = 0;
          int ans = 0;

          for (int i = 0; i < nums.length; i++) {
               max.add(i);
               min.add(i);

               // Ensure the max and min heaps are within the limit
               while (nums[max.peek()] - nums[min.peek()] > limit) {

                    while (min.peek() <= left) {
                         min.poll();
                    }
                    while (max.peek() <= left) {
                         max.poll();
                    }
                    left++;
               }

               ans = Math.max(ans, i - left + 1);
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}