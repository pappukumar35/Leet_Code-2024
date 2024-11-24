package NOvember;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Subarrays_With_Length_K {
     public long maximumSubarraySum(int[] arr, int k) {
          Map<Integer, Integer> um = new HashMap<>();
          Queue<Integer> q = new LinkedList<>();
          int l = 0, r = 0;
          long sum = 0, lastSum = 0;

          for (; r < k; r++) {
               um.put(arr[r], um.getOrDefault(arr[r], 0) + 1);
               lastSum += arr[r];

               if (um.get(arr[r]) > 1) {
                    q.add(arr[r]);
               }
          }

          while (r <= arr.length) {
               if (q.isEmpty()) {
                    sum = Math.max(lastSum, sum);
               }

               if (!q.isEmpty() && q.peek() == arr[l]) {
                    q.poll();
               }
               um.put(arr[l], um.get(arr[l]) - 1);
               lastSum -= arr[l];
               l++;

               if (r < arr.length) {
                    um.put(arr[r], um.getOrDefault(arr[r], 0) + 1);
                    lastSum += arr[r];

                    if (um.get(arr[r]) > 1) {
                         q.add(arr[r]);
                    }
               }
               r++;
          }

          return sum;
     }

     public static void main(String[] args) {

     }
}