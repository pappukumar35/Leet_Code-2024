package September;

import java.util.HashSet;
import java.util.Set;

public class Walking_Robot_Simulation {
     int[] dir_X = new int[] { 0, 1, 0, -1 };
     int[] dir_Y = new int[] { 1, 0, -1, 0 };

     public int robotSim(int[] commands, int[][] obstacles) {
          Set<String> set = new HashSet<>();
          for (int[] obstacle : obstacles) {
               set.add(obstacle[0] + " " + obstacle[1]);
          }

          int res = 0;
          int x = 0, y = 0, d = 0;
          for (int command : commands) {
               if (command == -1) {
                    d = (d + 1) % 4;
               } else if (command == -2) {
                    d = (d - 1 + 4) % 4;
               } else {
                    for (int i = 1; i <= command; i++) {
                         if (!set.contains((x + dir_X[d]) + " " + (y + dir_Y[d]))) {
                              x += dir_X[d];
                              y += dir_Y[d];
                         } else {
                              break;
                         }
                    }
                    res = Math.max(res, x * x + y * y);
               }
          }
          return res;
     }

     public static void main(String[] args) {

     }
}