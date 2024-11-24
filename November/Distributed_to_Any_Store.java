package NOvember;

public class Distributed_to_Any_Store {
     public int minimizedMaximum(int n, int[] nums) {
          int high = 0;
          for (int num : nums) {
               high = Math.max(high, num);
          }
          int ans = high;
          int low = 1;
          while (low <= high) {
               int mid = low + (high - low) / 2;
               int cnt = getCnt(nums, mid);
               if (cnt <= n) {
                    ans = mid;
                    high = mid - 1;
               } else
                    low = mid + 1;
          }
          return ans;
     }

     private int getCnt(int[] nums, int mid) {
          int cnt = 0;
          for (int n : nums) {
               cnt += (n + mid - 1) / mid;
          }
          return cnt;
     }

     public static void main(String[] args) {

     }
}