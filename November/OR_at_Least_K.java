package NOvember;

public class OR_at_Least_K {
     public int minimumSubarrayLength(int[] nums, int k) {
          int n = nums.length;
          int ans = Integer.MAX_VALUE;

          int[] bits = new int[32];
          for (int left = 0, right = 0; right < n; right++) {
               addBits(nums[right], bits);
               while (left <= right && getValue(bits) >= k) {
                    ans = Math.min(right - left + 1, ans);
                    removeBits(nums[left], bits);
                    left++;
               }
          }

          return ans == Integer.MAX_VALUE ? -1 : ans;
     }

     private void addBits(int num, int[] bits) {
          int i = 0;
          while (i < 32) {
               bits[i] += (num & 1);
               num >>= 1;
               i++;
          }
     }

     private void removeBits(int num, int[] bits) {
          int i = 0;
          while (i < 32) {
               bits[i] -= (num & 1);
               num >>= 1;
               i++;
          }
     }

     private int getValue(int[] bits) {
          int value = 0;
          for (int i = 0; i < 32; i++) {
               if (bits[i] != 0) {
                    value += Math.pow(2, i);
               }
          }
          return value;
     }

     public static void main(String[] args) {

     }
}