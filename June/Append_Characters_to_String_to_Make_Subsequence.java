package June;

import java.util.*;

public class Append_Characters_to_String_to_Make_Subsequence {

     public int appendCharacters(String s, String t) {
          int ind1 = 0;

          for (int i = 0; i < s.length(); i++) {
               if (ind1 < t.length() && s.charAt(i) == t.charAt(ind1)) {
                    ind1++;
               }
          }

          return t.length() - ind1;
     }

     public static void main(String[] args) {

     }
}