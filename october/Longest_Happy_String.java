package october;

import java.util.PriorityQueue;

public class Longest_Happy_String {
     public String longestDiverseString(int a, int b, int c) {
          // Create a max heap (priority queue) to store character frequencies
          PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.freq - p1.freq);

          // Push non-zero frequencies to the priority queue
          if (a > 0)
               pq.offer(new Pair(a, 'a'));
          if (b > 0)
               pq.offer(new Pair(b, 'b'));
          if (c > 0)
               pq.offer(new Pair(c, 'c'));

          // Initialize the result string
          StringBuilder result = new StringBuilder();

          // Main loop: continue while there are at least 2 characters left
          while (pq.size() > 1) {
               // Get the character with the highest frequency
               Pair pair1 = pq.poll();
               int freq1 = pair1.freq;
               char c1 = pair1.ch;

               // If the result string has 0 or 1 character, we can safely add c1
               if (result.length() <= 1) {
                    result.append(c1);
                    freq1--;
                    if (freq1 > 0)
                         pq.offer(new Pair(freq1, c1));
               } else {
                    // Check if adding c1 would create three consecutive same characters
                    if (result.charAt(result.length() - 1) == c1 && result.charAt(result.length() - 2) == c1) {
                         // If so, use the second most frequent character instead
                         Pair pair2 = pq.poll();
                         int freq2 = pair2.freq;
                         char c2 = pair2.ch;

                         result.append(c2);
                         freq2--;

                         // Push back the updated frequencies
                         if (freq2 > 0)
                              pq.offer(new Pair(freq2, c2));
                         if (freq1 > 0)
                              pq.offer(new Pair(freq1, c1));
                    } else {
                         // If no three consecutive same characters, add c1
                         result.append(c1);
                         freq1--;
                         if (freq1 > 0)
                              pq.offer(new Pair(freq1, c1));
                    }
               }
          }

          // Handle the case when only one character type is left
          if (!pq.isEmpty()) {
               Pair pair1 = pq.poll();
               int freq1 = pair1.freq;
               char c1 = pair1.ch;

               // Add at most two of the remaining character
               if (freq1 <= 1) {
                    result.append(c1);
               } else {
                    result.append(c1).append(c1);
               }
          }

          // Return the final diverse string
          return result.toString();
     }

     // Helper class to store frequency and character pairs
     private static class Pair {
          int freq;
          char ch;

          Pair(int freq, char ch) {
               this.freq = freq;
               this.ch = ch;
          }
     }

     public static void main(String[] args) {

     }
}