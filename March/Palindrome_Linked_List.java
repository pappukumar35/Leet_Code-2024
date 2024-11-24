package March;

import java.util.*;

class Palindrome_Linked_List {
     public class ListNode {
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

     public boolean isPalindrome(ListNode head) {
          List<Integer> list = new ArrayList();
          while (head != null) {
               list.add(head.val);
               head = head.next;
          }

          int left = 0;
          int right = list.size() - 1;
          while (left < right && list.get(left) == list.get(right)) {
               left++;
               right--;
          }
          return left >= right;
     }

}

public static void main(String[] args) {

}