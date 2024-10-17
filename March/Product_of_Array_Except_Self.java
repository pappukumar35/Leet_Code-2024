class Product_of_Array_Except_Self {
     public int[] productExceptSelf(int[] nums) {
          int n = nums.length;
          int[] leftProducts = new int[n];
          int[] rightProducts = new int[n];
          int[] result = new int[n];

          // Calculate left products
          leftProducts[0] = 1;
          for (int i = 1; i < n; i++) {
               leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
          }

          // Calculate right products
          rightProducts[n - 1] = 1;
          for (int i = n - 2; i >= 0; i--) {
               rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
          }

          // Calculate the final result
          for (int i = 0; i < n; i++) {
               result[i] = leftProducts[i] * rightProducts[i];
          }

          return result;
     }

     public static void main(String[] args) {

     }
}