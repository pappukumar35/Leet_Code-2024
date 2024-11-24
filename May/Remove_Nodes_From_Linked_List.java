package May;

import java.util.*;

import May.Delete_Node_in_a_Linked_List.ListNode;

public class Remove_Nodes_From_Linked_List {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public ListNode removeNodes(ListNode head) {
          if (head.next == null) {
               return head;
          }
          ListNode prevNode = head;
          ListNode currentNode = head.next;

          while (currentNode != null) {
               ListNode nextNode = currentNode.next;
               currentNode.next = prevNode;
               prevNode = currentNode;
               currentNode = nextNode;
          }
          head.next = null;
          head = prevNode;

          prevNode = head;
          currentNode = head.next;
          while (currentNode != null) {
               if (currentNode.val < prevNode.val) {
                    currentNode = currentNode.next;
               } else {
                    ListNode nextNode = currentNode.next;
                    currentNode.next = prevNode;
                    prevNode = currentNode;
                    currentNode = nextNode;
               }

          }
          head.next = null;
          head = prevNode;
          return head;
     }

     public static void main(String[] args) {

     }
}