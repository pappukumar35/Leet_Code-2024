package July;

import java.util.*;
import java.util.*;

public class Intersection_of_Two_Arrays_II {

     public int[] intersect(int[] nums1, int[] nums2) {
          Arrays.sort(nums1);
          Arrays.sort(nums2);

          int i = 0, j = 0;
          List<Integer> intersection = new ArrayList<>();

          while (i < nums1.length && j < nums2.length) {
               if (nums1[i] < nums2[j]) {
                    i++;
               } else if (nums1[i] > nums2[j]) {
                    j++;
               } else {
                    intersection.add(nums1[i]);
                    i++;
                    j++;
               }
          }

          // Convert the list to an array
          int[] result = new int[intersection.size()];
          for (int k = 0; k < intersection.size(); k++) {
               result[k] = intersection.get(k);
          }

          return result;
     }

     public static void main(String[] args) {

     }
}