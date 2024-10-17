package July;
import java.util.*;
public class Crawler Log Folder{
      public int minOperations(String[] logs) {
    var depth = 0;

    for (var log : logs) {
      switch (log) {
        case "../":
          depth = Math.max(0, depth - 1);
          break;
        case "./":
          break;
        default:
          depth++;
      }
    }
    return depth;
  }
     public static void main(String args[]){

     }

}