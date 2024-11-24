package June;

import java.util.*;
import java.util.*;

public class Replace_Words {
     public String replaceWords(List<String> dictionary, String sentence) {
          Set<String> dict = new HashSet<>(dictionary);
          String[] words = sentence.split(" ");
          StringBuilder result = new StringBuilder();
          for (String word : words) {
               if (result.length() > 0) {
                    result.append(" ");
               }
               result.append(findRoot(word, dict));
          }

          return result.toString();
     }

     private String findRoot(String word, Set<String> dict) {
          for (int i = 1; i <= word.length(); i++) {
               String prefix = word.substring(0, i);
               if (dict.contains(prefix)) {
                    return prefix;
               }
          }
          return word;
     }

     public static void main(String[] args) {

     }
}