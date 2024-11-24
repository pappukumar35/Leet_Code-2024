package July;

import java.util.*;

import May.Delete_Node_in_a_Linked_List.ListNode;

public class Merge_Nodes_in_Between_Zeros {
     static class Node {
          int val;
          Node next;
          Node right;
          Node left;

          Node(int data) {
               this.val = val;
               this.next = next;
               this.right = right;
               this.left = left;

          }
     }

     public static Node head;

     public ListNode mergeNodes(ListNode head) {
          head = head.next;
          ListNode start = head;
          while (start != null) {
               ListNode end = start;
               int sum = 0;
               while (end.val != 0) {
                    sum += end.val;
                    end = end.next;
               }
               start.val = sum;
               start.next = end.next;
               start = start.next;
          }
          return head;
     }

     public static void main(String[] args) {

     }
}