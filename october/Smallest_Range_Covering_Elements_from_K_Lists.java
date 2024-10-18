package october;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Smallest_Range_Covering_Elements_from_K_Lists {

     public int[] smallestRange(List<List<Integer>> nums) {
          int k = nums.size();
          List<Pair<Integer, Integer>> list = new ArrayList<>();
          for (int i = 0; i < k; i++) {
               List<Integer> l = nums.get(i);
               for (int nu : l) {
                    list.add(new Pair(nu, i));
               }
          }

          Collections.sort(list, (a, b) -> a.getKey() - b.getKey());
          int[] ans = new int[2];
          ans[1] = ans[0] = Integer.MAX_VALUE;
          int i = 0, j = 0;
          List<Integer> store = new ArrayList<>();
          HashMap<Integer, Integer> mp = new HashMap<>();
          int totalType = 0;

          while (j < list.size()) {
               int nu = list.get(j).getKey();
               int type = list.get(j).getValue();
               store.add(nu);
               int val = mp.getOrDefault(type, 0);
               mp.put(type, val + 1);
               totalType++;
               if (mp.size() < k) {
                    j++;
               } else if (mp.size() == k) {
                    if (ans[0] == ans[1] && ans[1] == Integer.MAX_VALUE) {
                         ans[0] = store.get(0);
                         ans[1] = store.get(store.size() - 1);
                    }
                    int dif = store.get(store.size() - 1) - store.get(0);
                    if (dif < ans[1] - ans[0]) {
                         ans[0] = store.get(0);
                         ans[1] = store.get(store.size() - 1);
                    }

                    while (mp.size() == k) {
                         dif = store.get(store.size() - 1) - store.get(0);
                         if (dif < ans[1] - ans[0]) {
                              ans[0] = store.get(0);
                              ans[1] = store.get(store.size() - 1);
                         }
                         store.remove(0);
                         int t = list.get(i).getValue();
                         int vv = (int) mp.get(t);
                         mp.put(t, vv - 1);
                         if (vv == 1) {
                              mp.remove(t);
                         }
                         i++;
                    }

                    j++;

               }

          }

          return ans;
     }

     public static void main(String[] args) {

     }
}