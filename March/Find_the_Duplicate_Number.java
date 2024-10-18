class Find_the_Duplicate_Number {
     public int findDuplicate(int[] nums) {
          Arrays.sort(nums);
          int prev = nums[0];
          for (int i = 1; i < nums.length; i++) {
               if (nums[i] == prev) {
                    return nums[i];
               } else {
                    prev = nums[i];
               }
          }
          return -1;
     }

     public static void main(String[] args) {

     }

}