package September;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers {
     public List<Integer> lexicalOrder(int n) {
          List<Integer> ans = new ArrayList<>(n);
          int current = 1;

          for (int i = 0; i < n; i++) {
               ans.add(current);
               if (current * 10 <= n) {
                    current *= 10;
               } else {
                    while (current % 10 == 9 || current + 1 > n) {
                         current /= 10;
                    }
                    current++;
               }
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}