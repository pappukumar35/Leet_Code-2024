package Aprial;

import java.util.*;
import java.util.*;

public class Open_the_Lock {
     public int openLock(String[] deadends, String target) {
          Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
          Queue<String> queue = new LinkedList<>();
          Set<String> visited = new HashSet<>();

          queue.offer("0000");
          visited.add("0000");
          int level = 0;

          while (!queue.isEmpty()) {
               int size = queue.size();

               while (size-- > 0) {
                    String current = queue.poll();

                    if (deadendSet.contains(current))
                         continue;
                    if (current.equals(target))
                         return level;

                    List<String> nextOptions = nextOptions(current);

                    for (String option : nextOptions) {
                         if (!visited.contains(option)) {
                              queue.offer(option);
                              visited.add(option);
                         }
                    }
               }
               level++;
          }

          return -1;
     }

     private char turnBottom(char c) {
          return (c == '9' ? '0' : (char) (c + 1));
     }

     private char turnUp(char c) {
          return (c == '0' ? '9' : (char) (c - 1));
     }

     private List<String> nextOptions(String s) {
          List<String> ans = new ArrayList<>();
          for (int i = 0; i < 4; i++) {
               StringBuilder copy = new StringBuilder(s);
               copy.setCharAt(i, turnBottom(s.charAt(i)));
               ans.add(copy.toString());
               copy.setCharAt(i, turnUp(s.charAt(i)));
               ans.add(copy.toString());
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}