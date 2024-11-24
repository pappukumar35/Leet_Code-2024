package NOvember;

public class Circular_Sentence {
     public boolean isCircularSentence(String sentence) {

          if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
               return false;

          String words[] = sentence.split(" ");

          char prev = words[0].charAt(words[0].length() - 1);

          for (int i = 1; i < words.length; i++) {

               String word = words[i];
               char st = word.charAt(0);
               if (st != prev)
                    return false;

               prev = word.charAt(word.length() - 1);
          }

          return true;
     }

     public static void main(String[] args) {

     }
}