package NOvember;

public class Rotate_String {
     public boolean rotateString(String s, String goal) {
          return s.length() == goal.length() && (goal + goal).contains(s);
     }

     public static void main(String[] args) {

     }
}