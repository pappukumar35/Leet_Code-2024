package october;

public class Count_Number_of_Maximum_Bitwise_OR_Subsets {
     int[] arr;
     int max = 0;

     public int countMaxOrSubsets(int[] nums) {
          this.arr = nums;
          for (int num : arr)
               max = max | num;
          if (max == 0)
               return (int) Math.pow(2, nums.length);
          return helper(0, 0);
     }

     public int helper(int curror, int curridx) {
          if (curror == max) {
               int remainingElts = arr.length - curridx;
               return (int) Math.pow(2, remainingElts);
          }
          if (curridx == arr.length && curror != max)
               return 0;
          return helper(curror | arr[curridx], curridx + 1) + (helper(curror, curridx + 1));
     }

     public static void main(String[] args) {

     }
}