package NOvember;

public class String_Compression {
     public String compressedString(String word) {
          StringBuilder ans = new StringBuilder();
          char prev = word.charAt(0);
          int count = 1;

          for (int i = 1; i < word.length(); i++) {
               if (prev != word.charAt(i)) {
                    ans.append(count);
                    ans.append(prev);
                    count = 1;
                    prev = word.charAt(i);
               } else {
                    if (count == 9) {
                         ans.append(count);
                         ans.append(prev);
                         count = 1;
                    } else {
                         count++;
                    }
               }
          }
          ans.append(count);
          ans.append(prev);

          return ans.toString();
     }

     public static void main(String[] args) {

     }
}