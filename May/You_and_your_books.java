package May;

import java.util.*;

public class You_and_your_books {

     long max_Books(int arr[], int n, int k) {
          long curr = 0, ans = 0;
          for (int i = 0; i < n; i++) {
               if (arr[i] <= k) {
                    curr += arr[i];
               } else {
                    curr = 0;
               }
               ans = Math.max(ans, curr);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}