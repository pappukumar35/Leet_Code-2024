package July;

import java.util.*;

public class Sort_Array_by_Increasing_Frequency {

     public int[] frequencySort(int[] nums) {
          var freq = new int[201][2];

          for (var i = 0; i < 201; i++)
               freq[i][0] = i - 100;

          for (var a : nums)
               freq[a + 100][1]++;

          Arrays.sort(freq, (a, b) -> a[1] == b[1] ? Integer.compare(b[0], a[0]) : Integer.compare(a[1], b[1]));

          var k = 0;
          for (var i = 0; i < 201; i++)
               for (var j = 0; j < freq[i][1]; j++)
                    nums[k++] = freq[i][0];

          return nums;
     }

     public static void main(String args[]) {

     }
}