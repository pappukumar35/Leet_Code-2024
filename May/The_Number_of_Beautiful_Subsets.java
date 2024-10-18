package May;

import java.util.*;
import java.util.*;

public class The_Number_of_Beautiful_Subsets {

     int ans = 0;

     public int beautifulSubsets(int[] nums, int k) {
          // Arrays.sort(nums);
          HashMap<Integer, Integer> hs = new HashMap<>();
          List<Integer> al = new ArrayList<>();
          findAns(nums, 0, k, al, hs);
          return ans - 1;
     }

     public void findAns(int[] nums, int i, int k, List<Integer> al, HashMap<Integer, Integer> hs) {
          ans++;

          for (int j = i; j < nums.length; j++) {

               if (hs.containsKey(nums[j] + k) && hs.get(nums[j] + k) > 0) {
                    continue;
               }
               if (hs.containsKey(nums[j] - k) && hs.get(nums[j] - k) > 0) {
                    continue;
               }

               hs.put(nums[j], hs.getOrDefault(nums[j], 0) + 1);
               al.add(nums[j]);
               findAns(nums, j + 1, k, al, hs);
               hs.put(nums[j], hs.get(nums[j]) - 1);
               al.remove(al.size() - 1);

          }
     }

     public static void main(String[] args) {

     }
}