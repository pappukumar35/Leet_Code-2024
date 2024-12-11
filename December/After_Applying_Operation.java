
import java.util.Arrays;

public class After_Applying_Operation {
     public int maximumBeauty(int[] nums, int k) {
          Arrays.sort(nums);
          int min = Integer.MIN_VALUE;
          int left = 0;
          int ans = 0;

          for (int right = 0; right < nums.length; ++right) {
               // Keep increasing minimum threashold
               min = Math.max(min, nums[right] - k);

               while (nums[left] + k < min) {
                    // Reduce window size and bring left within
                    // acceptable range
                    left++;
               }
               ans = Math.max(ans, right - left + 1);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}