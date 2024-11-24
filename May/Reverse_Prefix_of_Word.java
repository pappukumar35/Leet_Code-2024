package May;

import java.util.*;

public class Reverse_Prefix_of_Word {
     public String reversePrefix(String word, char ch) {
          int end = word.indexOf(ch); // Find the index of the first occurrence of 'ch'

          if (end == -1) // If 'ch' is not found in the word
               return word; // Return the original word

          // Convert the string to a char array to make it mutable
          char[] chars = word.toCharArray();

          // Reverse the prefix of the string up to the index 'end'
          int start = 0;
          while (start < end) {
               char temp = chars[start];
               chars[start] = chars[end];
               chars[end] = temp;
               start++;
               end--;
          }

          // Convert the char array back to string and return
          return new String(chars);
     }

     public static void main(String[] args) {

     }
}