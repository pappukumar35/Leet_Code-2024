class Remove_Nth_Node_From_End_of_List {
     public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode newHead = reverse(head);
          if (n == 1)
               return reverse(newHead.next);// whether the node to be removed is last node or not
          ListNode curr = head;
          for (curr = newHead; curr != null && n - 1 > 1; curr = curr.next) {// one node previous to the node to be
                                                                             // removed
               n--;
          }
          curr.next = curr.next.next;// update the link
          return reverse(newHead);
     }

     private ListNode reverse(ListNode head) {
          ListNode curr = head, prev = null;
          while (curr != null) {
               ListNode next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
          }
          return prev;
     }

     public static void main(String[] args) {

     }
}