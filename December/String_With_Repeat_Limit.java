
public class String_With_Repeat_Limit {
     public String repeatLimitedString(String s, int repeatLimit) {
          int n = s.length();
          StringBuilder sb = new StringBuilder();

          int freq[] = new int[26];
          for (char ch : s.toCharArray()) {
               freq[ch - 'a']++;
          }

          for (int i = 25; i >= 0; i--) {
               if (freq[i] == 0)
                    continue;

               int minAppend = Math.min(freq[i], repeatLimit);
               freq[i] -= minAppend;
               while (minAppend > 0) {
                    sb.append((char) ('a' + i));
                    minAppend--;
               }

               if (freq[i] != 0) {
                    for (int j = i - 1; j >= 0; j--) {
                         if (freq[j] == 0)
                              continue;
                         sb.append((char) ('a' + j));
                         freq[j]--;
                         i++;
                         break;
                    }
               }
          }
          return sb.toString();
     }

     public static void main(String[] args) {

     }
}