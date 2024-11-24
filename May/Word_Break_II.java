package May;

import java.util.*;
import java.util.*;

public class Word_Break_II {

     private Map<String, List<String>> dp = new HashMap<>();

     private List<String> helper(String s, List<String> wordDict) {

          if (s.isEmpty())
               return Collections.singletonList("");

          if (dp.containsKey(s))
               return dp.get(s);

          List<String> subpart, wholepart = new ArrayList<>();

          for (String word : wordDict) {
               if (!s.startsWith(word)) {
                    continue;
               } else {
                    subpart = helper(s.substring(word.length()), wordDict);
               }

               for (String substr : subpart) {
                    String space = substr.isEmpty() ? "" : " ";
                    wholepart.add(word + space + substr);
               }
          }
          dp.put(s, wholepart);
          return wholepart;
     }

     public List<String> wordBreak(String s, List<String> wordDict) {
          return helper(s, wordDict);
     }

     public static void main(String[] args) {

     }
}