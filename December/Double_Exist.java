package December;

import java.util.*;

public class Double_Exist {
     public static boolean checkIfExits(int arr[]) {
          Arrays.sort(arr);
          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] * 2 == arr[j] || arr[i] == 2 * arr[j]) {
                         return true;
                    }
               }
               return false;
          }
     }

     public static void main(String[] args) {

     }
}