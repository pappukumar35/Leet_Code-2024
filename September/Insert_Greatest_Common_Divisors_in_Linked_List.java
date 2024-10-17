package Sepetember;

public class Insert_Greatest_Common_Divisors_in_Linked_List {
     private int gcd(int a, int b) {
          if (b == 0)
               return a;
          return gcd(b, a % b);
     }

     public ListNode insertGreatestCommonDivisors(ListNode head) {
          var p = head;

          while (p.next != null) {
               var newNode = new ListNode(gcd(p.val, p.next.val), p.next);
               p.next = newNode;
               p = newNode.next;
          }
          return head;
     }

     public static void main(String[] args) {

     }
}