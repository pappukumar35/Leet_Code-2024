package December;

public class Overlapping_Events {
     public int maxTwoEvents(int[][] events) {
          Arrays.sort(events, (a, b) -> a[0] - b[0]);
          PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
          int m = 0;
          int res = 0;

          for (int[] x : events) {
               int s = x[0];
               int e = x[1];
               int v = x[2];
               while (!(q.isEmpty()) && q.peek()[0] < s) {
                    m = Math.max(m, q.poll()[1]);
               }
               res = Math.max(res, m + v);
               q.add(new int[] { e, v });
          }
          return res;
     }

     public static void main(String[] args) {

     }
}