public class Adding_Spaces_to_a_String {
     public String addSpaces(String s, int[] spaces) {
          StringBuilder sb = new StringBuilder();

          sb.append(s.substring(0, spaces[0]));
          int i = 1;
          for (; i < spaces.length; i++) {
               sb.append(" ");
               sb.append(s.substring(spaces[i - 1], spaces[i]));
          }
          sb.append(" ");
          sb.append(s.substring(spaces[i - 1]));

          return sb.toString();
     }

     public static void main(String[] args) {

     }
}
