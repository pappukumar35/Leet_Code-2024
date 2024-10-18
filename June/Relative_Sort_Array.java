package June;

import java.util.*;
import java.util.*;

public class Relative_Sort_Array {
     public int[] relativeSortArray(int[] arr1, int[] arr2) {
          List<Integer> result = new ArrayList<>();

          for (int i = 0; i < arr2.length; i++) {
               for (int j = 0; j < arr1.length; j++) {
                    if (arr1[j] == arr2[i]) {
                         result.add(arr1[j]);
                         arr1[j] = -1;
                    }
               }
          }

          Arrays.sort(arr1);

          for (int i = 0; i < arr1.length; i++) {
               if (arr1[i] != -1) {
                    result.add(arr1[i]);
               }
          }

          // Convert List<Integer> to int[]
          return result.stream().mapToInt(Integer::intValue).toArray();
     }

     public static void main(String[] args) {

     }
}