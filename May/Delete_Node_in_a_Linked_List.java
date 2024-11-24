package May;

import java.util.*;

public class Delete_Node_in_a_Linked_List {
     public static class ListNode {
          int val;
          ListNode next;

          ListNode(int val) {
               this.val = val;
               this.next = next;
          }
     }

     public void deleteNode(ListNode node) {
          node.val = node.next.val;
          node.next = node.next.next;

     }

     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();

     }
}