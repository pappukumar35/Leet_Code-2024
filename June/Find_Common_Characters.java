package June;

import java.util.*;
import java.util.*;

public class Find_Common_Characters {
     public List<String> commonChars(String[] words) {
          int[] finalFreq = new int[26];
          Arrays.fill(finalFreq, Integer.MAX_VALUE);

          for (String word : words) {
               int[] curFreq = new int[26];
               for (char c : word.toCharArray()) {
                    curFreq[c - 'a']++;
               }
               for (int i = 0; i < 26; i++) {
                    finalFreq[i] = Math.min(finalFreq[i], curFreq[i]);
               }
          }

          List<String> ans = new ArrayList<>();
          for (int i = 0; i < 26; i++) {
               while (finalFreq[i] > 0) {
                    ans.add(String.valueOf((char) (i + 'a')));
                    finalFreq[i]--;
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}