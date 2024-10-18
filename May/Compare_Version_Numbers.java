package May;

import java.util.*;

public class Compare_Version_Numbers {
     public int compareVersion(String version1, String version2) {
          int i = 0, j = 0;
          int[] result1, result2;
          while (i < version1.length() || j < version2.length()) {
               result1 = helper(version1, i);
               result2 = helper(version2, j);
               int v1 = result1[0], v2 = result2[0];
               i = result1[1];
               j = result2[1];
               if (v1 > v2)
                    return 1;
               else if (v1 < v2)
                    return -1;
          }
          return 0;
     }

     private int[] helper(String s, int idx) {
          int num = 0;
          while (idx < s.length()) {
               if (s.charAt(idx) == '.')
                    break;
               else
                    num = num * 10 + (s.charAt(idx) - '0');
               idx++;
          }
          return new int[] { num, idx + 1 };
     }

     public static void main(String[] args) {

     }
}