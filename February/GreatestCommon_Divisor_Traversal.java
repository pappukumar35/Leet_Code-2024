import java.util.*;

class GreatestCommon_Divisor_Traversal {
     public boolean canTraverseAllPairs(int[] nums) {
          if (nums.length == 1)
               return true;
          int n = nums.length;
          int maxElement = Arrays.stream(nums).max().getAsInt();
          if (Arrays.stream(nums).min().getAsInt() == 1)
               return false;
          int[] factorArray = factorsCalculator(maxElement);

          int[] parent = new int[maxElement + 1];
          int[] rank = new int[maxElement + 1];
          for (int i = 0; i < parent.length; i++) {
               parent[i] = i;
               rank[i] = 1;
          }

          for (int num : nums) {
               int x = num;
               while (x > 1) {
                    int p = factorArray[x];
                    union(parent, rank, p, num);
                    while (x % p == 0) {
                         x = x / p;
                    }
               }
          }

          int p = find(parent, nums[0]);
          for (int i = 1; i < nums.length; i++) {
               if (find(parent, nums[i]) != p)
                    return false;
          }

          return true;
     }

     private int[] factorsCalculator(int n) {
          int[] dp = new int[n + 2];
          for (int i = 0; i < dp.length; i++) {
               dp[i] = i;
          }
          for (int i = 2; i <= n; i++) {
               if (dp[i] == i) {
                    for (int j = i * 2; j <= n; j += i) {
                         if (dp[j] == j)
                              dp[j] = i;
                    }
               }
          }
          return dp;
     }

     private int find(int[] parent, int a) {
          return parent[a] = parent[a] == a ? a : find(parent, parent[a]);
     }

     private void union(int[] parent, int[] rank, int a, int b) {
          a = find(parent, a);
          b = find(parent, b);
          if (a == b)
               return;
          if (rank[a] < rank[b]) {
               int temp = a;
               a = b;
               b = temp;
          }
          parent[b] = a;
          rank[a] += rank[b];
     }

     public static void main(String[] args) {

     }
}