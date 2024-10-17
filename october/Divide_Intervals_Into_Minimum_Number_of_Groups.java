package october;

import java.util.PriorityQueue;

public class Divide_Intervals_Into_Minimum_Number_of_Groups {
     public int minGroups(int[][] intervals) {
          Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
          PriorityQueue<Integer> pq = new PriorityQueue<>();

          for (int[] interval : intervals) {
               if (!pq.isEmpty() && pq.peek() < interval[0]) {
                    pq.poll();
               }
               pq.offer(interval[1]);
          }

          return pq.size();
     }

     public static void main(String[] args) {

     }
}