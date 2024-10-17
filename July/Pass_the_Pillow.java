package July;

import java.util.*;

public class Pass_the_Pillow {
     public int passThePillow(int n, int time) {
          int chunks = time / (n - 1);
          return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
     }

     public static void main(String[] args) {

     }
}