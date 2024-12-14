package December;

import java.util.TreeMap;

public class Continuous_Subarrays {
     public long continuousSubarrays(int[] nums) {
          TreeMap<Integer, Integer> map = new TreeMap<>();
          int i = 0;
          int j = 0;
          int n = nums.length;
          long count = 0;
          while (j < n) {
               map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

               while (Math.abs(map.firstKey() - map.lastKey()) > 2) {
                    map.put(nums[i], map.get(nums[i]) - 1);
                    if (map.get(nums[i]) == 0) {
                         map.remove(nums[i]);
                    }
                    i++;
               }
               count += j - i + 1;
               j++;
          }
          return count;
     }

     public static void main(String[] args) {

     }
}