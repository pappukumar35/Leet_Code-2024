class Middle_of_the_Linked_List {
     public int listLength(ListNode head) {
          int len = 0;
          while (head != null) {
               len++;
               head = head.next;
          }
          return len;
     }

     public ListNode middleNode(ListNode head) {
          int len = listLength(head);
          int middle = len / 2;
          ListNode temp = head;
          int count = 0;
          while (count < middle) {
               temp = temp.next;
               count++;
          }
          return temp;
     }
}