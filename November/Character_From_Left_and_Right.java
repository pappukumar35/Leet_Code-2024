package NOvember;

public class Character_From_Left_and_Right {
     boolean isValid(int[] freq, int k) {
          return freq[0] >= k && freq[1] >= k && freq[2] >= k;
     }

     public int takeCharacters(String s, int k) {
          int[] freq = new int[3];

          for (char c : s.toCharArray()) {
               freq[c - 'a'] += 1;
          }

          if (!isValid(freq, k))
               return -1;

          int i = 0, j = 0, max = -1;
          while (j < s.length()) {
               freq[s.charAt(j) - 'a'] -= 1;
               while (!isValid(freq, k)) {
                    freq[s.charAt(i) - 'a'] += 1;
                    i++;
               }
               max = Math.max(max, j - i + 1);
               j++;
          }

          return s.length() - max;
     }

     public static void main(String[] args) {

     }
}