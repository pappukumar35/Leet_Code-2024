import java.util.*;

public class Merge_In_Between_Linked_Lists {
     public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
          int c = 1;
          int d = 1;
          ListNode head1 = list1;
          ListNode head = list1;
          while (d <= b) {
               head1 = head1.next;
               d++;
          }
          if (head1.next != null)
               head1 = head1.next;
          while (c < a) {
               list1 = list1.next;
               c++;
          }
          ListNode head2 = list2;
          while (list2.next != null) {
               list2 = list2.next;
          }
          list1.next = head2;
          list2.next = head1;
          return head;
     }

     public static void main(String[] args) {

     }

}
