package Sepetember;

public class Spiral_Matrix_IV {
     public int[][] spiralMatrix(int m, int n, ListNode head) {
          int[][] result = new int[m][n];
          for (int[] r : result) {
               Arrays.fill(r, -1);
          }
          if (head == null)
               return result;
          int top = 0, down = result.length - 1, left = 0, right = result[0].length - 1;
          ListNode temp = head;
          while (temp != null && top <= down && left <= right) {
               for (int i = left; i <= right; i++) {
                    if (temp != null) {
                         result[top][i] = temp.val;
                         temp = temp.next;
                    }
               }
               top++;
               for (int i = top; i <= down; i++) {
                    if (temp != null) {
                         result[i][right] = temp.val;
                         temp = temp.next;
                    }
               }
               right--;
               for (int i = right; i >= left; i--) {
                    if (temp != null) {
                         result[down][i] = temp.val;
                         temp = temp.next;
                    }
               }
               down--;
               for (int i = down; i >= top; i--) {
                    if (temp != null) {
                         result[i][left] = temp.val;
                         temp = temp.next;
                    }
               }
               left++;
          }
          return result;
     }

     public static void main(String[] args) {

     }
}