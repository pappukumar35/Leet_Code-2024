package May;

import java.util.*;
import java.util.*;

public class Maximum_Score_Words_Formed_by_Letters {

     public int maxScoreWords(String[] words, char[] letters, int[] score) {
          // Step 1: Count the available letters
          Map<Character, Integer> lettersCounter = new HashMap<>();
          for (char letter : letters) {
               lettersCounter.put(letter, lettersCounter.getOrDefault(letter, 0) + 1);
          }

          // Step 2: Initialize the totalScore
          int[] totalScore = new int[1];

          // Step 3: Define the recursive function to explore all combinations
          explore(words, lettersCounter, score, 0, 0, totalScore);

          // Step 4: Return the maximum score found
          return totalScore[0];
     }

     private void explore(String[] words, Map<Character, Integer> letterCounter, int[] score, int index, int currScore,
               int[] totalScore) {
          // Update the total score with the current score if it's higher
          totalScore[0] = Math.max(totalScore[0], currScore);

          // Base case: if all words have been considered, return
          if (index == words.length) {
               return;
          }

          // Step 3: Try each word starting from the current index
          for (int i = index; i < words.length; i++) {
               Map<Character, Integer> tmpCounter = new HashMap<>(letterCounter);
               String word = words[i];
               int wordScore = 0;
               boolean isValid = true;

               // Check if the word can be formed with the available letters
               for (char ch : word.toCharArray()) {
                    if (tmpCounter.getOrDefault(ch, 0) > 0) {
                         tmpCounter.put(ch, tmpCounter.get(ch) - 1);
                         wordScore += score[ch - 'a'];
                    } else {
                         isValid = false;
                         break;
                    }
               }

               // If the word can be formed, explore further with the updated state
               if (isValid) {
                    explore(words, tmpCounter, score, i + 1, currScore + wordScore, totalScore);
               }
          }
     }

     public static void main(String[] args) {

     }

}