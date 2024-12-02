public enum Word_in_a_Sentence {
     public int isPrefixOfWord(String sentence, String searchWord) {
          int l = 0, r = 0, it = 0, ord = 0;
          sentence += " "; // Append space to handle the last word
          int length = searchWord.length();
  
          while (r < sentence.length()) {
              if (sentence.charAt(r) == ' ') { // If a space is found
                  ord++; // Increment word index
                  if (r - l >= length) { // Check if the word is long enough
                      while (l < r) { // Compare characters
                          if (searchWord.charAt(it) == sentence.charAt(l)) {
                              l++;
                              it++;
                              if (it == length) { // If all characters match
                                  return ord; // Return the word index
                              }
                          } else { // Reset pointers for the next word
                              it = 0;
                              l = r + 1;
                              break;
                          }
                      }
                  } else {
                      l = r + 1; // Move to the next word
                  }
              }
              r++; // Increment right pointer
          }
  
          return -1; // Return -1 if no match is found
      }
     public static void main(String[] args) {
          
     }
}
