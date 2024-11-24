class Find_All_Duplicates_in_an_Array {

     public List<Integer> findDuplicates(int[] nums) {
          List<Integer> result = new ArrayList<>();
          int n = nums.length;
          for (int i = 0; i < n; i++) {
               int num = Math.abs(nums[i]);
               int idx = num - 1;
               if (nums[idx] < 0)
                    result.add(num);
               nums[idx] *= -1;
          }
          return result;
     }

     public static void main(String[] args) {

     }
}