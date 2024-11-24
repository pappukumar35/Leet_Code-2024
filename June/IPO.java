package June;

import java.util.*;
import java.util.*;

public class IPO {
     public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
          List<int[]> projects = new ArrayList<>();
          for (int i = 0; i < profits.length; i++) {
               projects.add(new int[] { capital[i], profits[i] });
          }

          projects.sort((a, b) -> a[0] - b[0]);
          PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

          for (int i = 0; i < projects.size(); i++) {
               if (w >= projects.get(i)[0]) {
                    maxHeap.offer(projects.get(i)[1]);
               } else if (k > 0 && !maxHeap.isEmpty()) {
                    k--;
                    i--;
                    w += maxHeap.poll();
               }
          }

          while (!maxHeap.isEmpty() && k > 0) {
               w += maxHeap.poll();
               k--;
          }

          return w;
     }

     public static void main(String[] args) {

     }
}
