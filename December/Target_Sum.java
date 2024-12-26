package December;

public class Target_Sum {
     public int findTargetSumWays(int[] nums, int target) {
          int sum = 0;
          for (int x : nums)
               sum += x;
          if (((sum - target) % 2 == 1) || (target > sum))
               return 0;

          int n = nums.length;
          int val = (sum - target) / 2;
          int[][] t = new int[n + 1][val + 1];
          t[0][0] = 1;

          for (int i = 1; i < n + 1; i++) {
               for (int j = 0; j < val + 1; j++) {
                    if (nums[i - 1] <= j)
                         t[i][j] = t[i - 1][j] + t[i - 1][j - nums[i - 1]];
                    else
                         t[i][j] = t[i - 1][j];
               }
          }
          return t[n][val];
     }

     public static void main(String[] args) {

     }
}