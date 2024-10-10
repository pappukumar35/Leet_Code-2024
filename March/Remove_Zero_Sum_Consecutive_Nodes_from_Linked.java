class Remove_Zero_Sum_Consecutive_Nodes_from_Linked {
     public ListNode removeZeroSumSublists(ListNode head) {

          ListNode dummy = new ListNode(0, head);
          ListNode curr = dummy;
          int prefixSum = 0;

          Map<Integer, ListNode> map = new HashMap<>();
          map.put(0, dummy);

          while (curr != null) {
               prefixSum += curr.val;
               map.put(prefixSum, curr);
               curr = curr.next;
          }

          prefixSum = 0;
          curr = dummy;

          while (curr != null) {
               prefixSum += curr.val;
               curr.next = map.get(prefixSum).next;
               curr = curr.next;
          }
          return dummy.next;
     }

     public static void main(String[] args) {

     }
}