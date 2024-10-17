package June;

import java.util.*;

public class Find_Center_of_Star_Graph {
     public int findCenter(int[][] edges) {
          if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
               return edges[0][0];
          } else {
               return edges[0][1];
          }
     }

     public static void main(String[] args) {

     }
}