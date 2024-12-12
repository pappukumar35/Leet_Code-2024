package December;

public class Richest_PileRichest_Pile {
     public long pickGifts(int[] gifts, int k) {
          long sum = 0;
          PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
          for (int i : gifts) {
               sum += i;
               pq.add(i);
          }
          long c = 0;
          for (int i = 0; i < k; i++) {
               int cur = pq.poll();
               int a = (int) Math.floor(Math.sqrt(cur));
               c += (cur - a);
               pq.add(a);
          }
          return sum - c;
     }

     public static void main(String[] args) {

     }
}