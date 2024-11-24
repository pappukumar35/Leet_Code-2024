class Linked_List_Cycle {
     public boolean hasCycle(ListNode head) {
          ListNode fast = head; // Initialize fast pointer to head
          ListNode slow = head; // Initialize slow pointer to head
          while (fast != null && fast.next != null) { // Traverse the list until fast pointer reaches end or NULL
               fast = fast.next.next; // Move fast pointer two steps ahead
               slow = slow.next; // Move slow pointer one step ahead
               if (fast == slow) { // If fast meets slow, there is a cycle
                    return true;
               }
          }
          return false; // If fast reaches NULL, there is no cycle
     }
}