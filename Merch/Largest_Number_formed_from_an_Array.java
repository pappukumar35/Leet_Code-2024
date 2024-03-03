import java.util.Arrays;
import java.util.Comparator;

class Largest_Number_formed_from_an_Array {
     String printLargest(int n, String[] arr) {

          Comparator<String> com = new Comparator<String>() {
               public int compare(String st1, String st2) {
                    String s1 = st1 + st2;
                    String s2 = st2 + st1;

                    return s2.compareTo(s1);
               }
          };

          Arrays.sort(arr, com);

          StringBuilder result = new StringBuilder();
          for (String s : arr) {
               result.append(s);
          }
          return result.toString();
     }

     public static void main(String[] args) {

     }
}