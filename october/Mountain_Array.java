package october;
public class Mountain_Array{

     public int minimumMountainRemovals(int[] nums) {
          // Combination of Longest Increasing Subsequence and Trapping Rain Water
          int n = nums.length;
          int[] leftDP = new int[n];
          int[] rightDP = new int[n];
          Arrays.fill(leftDP, 1);
          Arrays.fill(rightDP, 1);
          // Find LIS from left
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < i; j++) {
                  if (nums[i] > nums[j]) {
                      leftDP[i] = Math.max(leftDP[i], leftDP[j] + 1);
                  }
              }
          }
          // Find LIS from right
          for (int i = n - 1; i >= 0; i--) {
              for (int j = n - 1; j > i; j--) {
                  if (nums[i] > nums[j]) {
                      rightDP[i] = Math.max(rightDP[i], rightDP[j] + 1);
                  }
              }
          }
          // Find largest mountain by finding largest sum
          int ans = 0;
          for (int i = 0; i < n; i++) {
              // Make sure there is a left and right slope, or else it's not a mountain
              if (leftDP[i] != 1 && rightDP[i] != 1) {
                  ans = Math.max(ans, leftDP[i] + rightDP[i]);
              }
          }
          /* Debugging purposes
          for (int i : leftDP) {
              System.out.println(i);
          }
          System.out.println("RIGHT");
          for (int j : rightDP) {
              System.out.println(j);
          }
          */
          // Return the number of numbers to remove to form the mountain
          return n - ans + 1;
      }
     public static void main(String[] args) {
          
     }

}