
public class Multiplication_Operations {

     public int[] getFinalState(int[] nums, int k, int multiplier) {
          int minIndex = 0;
          for (int i = 0; i < k; i++) {
               for (int j = 1; j < nums.length; j++) {
                    if (nums[j] < nums[minIndex]) {
                         minIndex = j;
                    }
               }
               nums[minIndex] *= multiplier;
          }
          return nums;
     }

     public static void main(String args[]) {

     }
}