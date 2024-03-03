import java.util.Map;
import java.util.*;

class First_element_to_occur_k_times {
     public int firstElementKTime(int n, int k, int[] a) {
          Map<Integer, Integer> mp = new HashMap<>();
          for (int i = 0; i < n; i++) {
               mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
               if (mp.containsKey(a[i]) && mp.get(a[i]) == k) {
                    return a[i];

               }

          }
          return -1;

     }
}
