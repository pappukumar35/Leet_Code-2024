package July;

import java.util.*;

public class Count_Number_of_Teams {
     public int numTeams(int[] rating) {
          int res = 0;
          for (int i = 0; i < rating.length - 2; i++) {
               for (int j = i + 1; j < rating.length - 1; j++) {
                    for (int k = j + 1; k < rating.length; k++) {
                         if ((rating[i] < rating[j] && rating[j] < rating[k])
                                   || (rating[i] > rating[j] && rating[j] > rating[k])) {
                              res++;
                         }
                    }
               }
          }
          return res;
     }

     public static void main(String[] args) {

     }
}