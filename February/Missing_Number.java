class Missing_Number {
     public int missingNumber(int[] nums) {
          int n = nums.length;
          int[] v = new int[n + 1];
          Arrays.fill(v, -1);
          for (int i = 0; i < nums.length; i++) {
               v[nums[i]] = nums[i];
          }
          for (int i = 0; i < v.length; i++) {
               if (v[i] == -1)
                    return i;
          }
          return 0;
     }
}