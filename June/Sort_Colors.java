package June;

import java.util.*;

public class Sort_Colors {
     public void sortColors(int[] nums) {
          int n = nums.length;
          for (int i = 0; i < n; i++) {
               for (int j = i + 1; j < n; j++) {
                    if (nums[i] > nums[j]) {
                         // Swap nums[i] and nums[j]
                         int temp = nums[i];
                         nums[i] = nums[j];
                         nums[j] = temp;
                    }
               }
          }
     }

     public static void main(String[] args) {

     }
}