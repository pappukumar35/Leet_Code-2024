import java.util.*;

public class Reverse_Array {
     static class ListNode {
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

     public ListNode reverseList(ListNode head) {
          ListNode curr = head;
          ListNode prev = null;
          while (curr != null) {
               ListNode temp = curr.next;
               curr.next = prev;
               prev = curr;
               curr = temp;
          }
          return prev;
     }

     public static void main(String[] args) {
          Reverse_Array reverseArray = new Reverse_Array(); // Create an instance of Reverse_Array
          ListNode head = new ListNode(1);
          head.next = new ListNode(2);
          head.next.next = new ListNode(3);
          head.next.next.next = new ListNode(4);
          head.next.next.next.next = new ListNode(5);

          ListNode reversed = reverseArray.reverseList(head);
          while (reversed != null) {
               System.out.print(reversed.val + " ");
               reversed = reversed.next;
          }
     }
}
