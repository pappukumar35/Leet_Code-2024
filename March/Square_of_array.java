class Square_of_array {
     public int[] sortedSquares(int[] nums) {
          for (int i = 0; i < nums.length; i++) {
               nums[i] = nums[i] * nums[i];
          }
          Arrays.sort(nums);
          return nums;
     }
}