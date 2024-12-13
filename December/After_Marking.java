package December;

import java.util.*;

public class After_Marking {
     public long findScore(int[] nums) {
          PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
               if (a[0] != b[0]) {
                    return a[0] - b[0];
               } else {
                    return a[1] - b[1];
               }
          });

          boolean[] visited = new boolean[nums.length];
          long result = 0;

          for (int i = 0; i < nums.length; i++) {
               minHeap.add(new int[] { nums[i], i });
          }

          while (!minHeap.isEmpty()) {
               int[] current = minHeap.poll();
               int key = current[0];
               int val = current[1];

               if (!visited[val]) {
                    result += key;
                    visited[val] = true;

                    if (val + 1 < nums.length && !visited[val + 1]) {
                         visited[val + 1] = true;
                    }
                    if (val - 1 >= 0 && !visited[val - 1]) {
                         visited[val - 1] = true;
                    }
               }
          }
          return result;
     }

     public static void main(String[] args) {

     }
}