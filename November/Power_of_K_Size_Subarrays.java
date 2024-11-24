package NOvember;

public class Power_of_K_Size_Subarrays {
     public int[] resultsArray(int[] nums, int k) {
          int n = nums.length;
          int[] ans = new int[n - k + 1]; // Initialize result array with size (n - k + 1)
          for (int i = 0; i < ans.length; i++) {
               ans[i] = -1; // Fill the array with -1 as the default value
          }

          int i = 0, j = 0;
          while (j < n) {
               if (j > 0 && nums[j] - nums[j - 1] != 1) {
                    i = j; // Reset the 'i' index if the difference is not 1
               }

               // Ensure the window size is not greater than k
               while (i < j && j - i + 1 > k) {
                    i++; // Shrink the window from the left
               }

               // If we have exactly k elements in the window, update the answer array
               if (j - i + 1 == k) {
                    ans[j - k + 1] = nums[j]; // Store the current element in the result array
               }
               j++; // Move the right pointer
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}