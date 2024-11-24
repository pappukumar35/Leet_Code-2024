package Aprial;

import java.util.*;

public class Length_of_Last_Word {
     public int lengthOfLastWord(String s) {
          int count = 0;
          for (int i = s.length() - 1; i >= 0; i--) {
               if (s.charAt(i) == ' ' && count == 0)
                    continue;
               if (s.charAt(i) == ' ' && count != 0)
                    return count;
               if (s.charAt(i) != ' ')
                    count++;
          }
          return count;
     }

     public static void main(String[] args) {

     }

}
