package November;

public class Delete_Characters_to_Make_Fancy_String {

     public String makeFancyString(String s) {
          if (s.length() < 3) {
               return s;
          }
          StringBuilder stackString = new StringBuilder();
          stackString.append(s.charAt(0));
          stackString.append(s.charAt(1));
          for (int i = 2; i < s.length(); i++) {
               if (s.charAt(i) == stackString.charAt(stackString.length() - 1)
                         && s.charAt(i) == stackString.charAt(stackString.length() - 2)) {
                    continue;
               } else {
                    stackString.append(s.charAt(i));
               }
          }

          return stackString.toString();
     }

     public static void main(String[] args) {

     }
}