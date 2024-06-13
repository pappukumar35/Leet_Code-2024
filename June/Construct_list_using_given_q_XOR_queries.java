package June;

import java.util.*;
import java.util.*;

public class Construct_list_using_given_q_XOR_queries {
     public static class Node {
          int data;
          Node next;

          Node(int data) {
               this.next = next;
               this.data = data;
          }

     }

     public static ArrayList<Integer> constructList(int q, int[][] queries) {
          ArrayList<Integer> ans = new ArrayList<>();
          int xor = 0;
          for (int i = q - 1; i >= 0; i--) {
               if (queries[i][0] == 0)
                    ans.add(queries[i][1] ^ xor);
               else
                    xor ^= queries[i][1];
          }
          ans.add(xor);
          Collections.reverse(ans);
          Collections.sort(ans);
          return ans;
     }

     public static void main(String[] args) {

     }
}