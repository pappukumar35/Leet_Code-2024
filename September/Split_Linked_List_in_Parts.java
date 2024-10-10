package September;

import java.util.*;

public class Split_Linked_List_in_Parts {
     public class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
               this.val = val;
          }

          ListNode(int val, ListNode next) {
               this.val = val;
               this.next = next;
          }
     }

     public ListNode[] splitListToParts(ListNode head, int k) {
          int cnt = 0;
          ListNode curr = head;
          while (curr != null) {
               cnt++;
               curr = curr.next;
          }
          int noOfNodes = cnt / k;
          int remainNodes = cnt % k;

          curr = head;
          ListNode prev = null;
          ListNode[] ans = new ListNode[k];

          for (int i = 0; i < k && curr != null; i++) {
               ans[i] = curr;
               for (int count = 1; count <= noOfNodes + (remainNodes > 0 ? 1 : 0); count++) {
                    prev = curr;
                    curr = curr.next;
               }
               if (prev != null)
                    prev.next = null;
               remainNodes--;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}