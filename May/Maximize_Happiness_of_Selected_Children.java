package May;

import java.util.*;
import java.util.*;

public class Maximize_Happiness_of_Selected_Children {
     public long maximumHappinessSum(int[] happiness, int k) {
          Arrays.sort(happiness);
          int dec = 0, n = happiness.length;
          long ans = 0;
          for (int i = n - 1; i >= n - k; i--) {
               ans += Math.max(0, happiness[i] - dec);
               dec++;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}