package october;

import java.util.HashSet;
import java.util.*;

public class Longest_Square_Streak_in_an_Array {
     public int longestSquareStreak(int[] nums) {
          Arrays.sort(nums);
          HashSet<Integer> numSet = new HashSet<>();
          for (int num : nums) {
               numSet.add(num);
          }

          int maxLength = -1;

          for (int num : nums) {
               int length = 0;
               long current = num;

               while (numSet.contains((int) current)) {
                    length++;
                    current *= current;
                    if (current > Integer.MAX_VALUE)
                         break;
               }

               if (length >= 2) {
                    maxLength = Math.max(maxLength, length);
               }
          }
          return maxLength;
     }

     public static void main(String[] args) {

     }
}