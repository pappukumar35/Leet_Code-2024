package July;

import java.util.*;

import May.Delete_Node_in_a_Linked_List.ListNode;

public class Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points {
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

     public int[] nodesBetweenCriticalPoints(ListNode head) {
          // Initialize necessary variables
          int firstCriticalIndex = -1;
          int lastCriticalIndex = -1;
          int smallestDistance = Integer.MAX_VALUE;
          int prevValue = head.val;

          ListNode currentNode = head.next;
          int currentIndex = 1;

          // Traverse the list
          while (currentNode != null && currentNode.next != null) {
               // Check if the current node is a critical point
               if ((prevValue < currentNode.val && currentNode.val > currentNode.next.val) ||
                         (prevValue > currentNode.val && currentNode.val < currentNode.next.val)) {

                    // If it's the first critical point found, set firstCriticalIndex
                    if (firstCriticalIndex == -1) {
                         firstCriticalIndex = currentIndex;
                    } else {
                         // Update the smallest distance if not the first critical point
                         smallestDistance = Math.min(smallestDistance, currentIndex - lastCriticalIndex);
                    }

                    // Update the last critical point index
                    lastCriticalIndex = currentIndex;
               }

               // Move to the next node
               prevValue = currentNode.val;
               currentNode = currentNode.next;
               currentIndex++;
          }

          // If no or only one critical point is found
          if (firstCriticalIndex == -1 || lastCriticalIndex == firstCriticalIndex) {
               return new int[] { -1, -1 };
          }

          // Return the minimum and maximum distances between critical points
          return new int[] { smallestDistance, lastCriticalIndex - firstCriticalIndex };
     }

     public static void main(String[] args) {

     }
}