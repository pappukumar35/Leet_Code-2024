package May;

import java.util.*;

import May.Delete_Node_in_a_Linked_List.ListNode;

public class Double_Number_Represented_as_a_Linked_List {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public ListNode doubleIt(ListNode head) {
          Pair<Integer, ListNode> result = func(head);
          if (result.getKey() != 0) {
               ListNode newHead = new ListNode(result.getKey());
               newHead.next = result.getValue();
               return newHead;
          }
          return result.getValue();
     }

     private Pair<Integer, ListNode> func(ListNode head) {
          int a = head.val * 2;
          if (head.next != null) {
               Pair<Integer, ListNode> nextResult = func(head.next);
               a += nextResult.getKey();
          }
          head.val = a % 10;
          return new Pair<>(a / 10, head);
     }

     public static void main(String[] args) {

     }
}