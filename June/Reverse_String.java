package June;

import java.util.*;

public class Reverse_String {
     public void reverseString(char[] s) {
          int left = 0;
          int right = s.length - 1;

          while (left < right) {
               // Swap characters at left and right pointers
               char temp = s[left];
               s[left] = s[right];
               s[right] = temp;

               // Move pointers towards the center
               left++;
               right--;
          }
     }

     public static void main(String[] args) {

     }
}