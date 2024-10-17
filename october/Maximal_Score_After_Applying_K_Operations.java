package october;

import java.util.PriorityQueue;

public class Maximal_Score_After_Applying_K_Operations {
     public long maxKelements(int[] nums, int k) {
          int val;
          long res = 0L;
          PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
          for (int num : nums) {
               pq.add(num);
          }
          while (k-- > 0) {
               val = pq.poll();
               res += val;
               pq.add((int) Math.ceil(val / 3.0));
          }
          return res;
     }

     public static void main(String[] args) {

     }
}