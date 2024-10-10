package Auguest;

import java.util.HashSet;
import java.util.Set;

public class Most_Stones_Removed_with_Same_Row_or_Column {
     public int removeStones(int[][] stones) {
          int parent[] = new int[20001];
          for (int i = 0; i <= 20000; i++)
               parent[i] = i;
          for (int[] stone : stones) {
               int x = stone[0];
               int y = stone[1];
               union(parent, x, y + 10001);
          }
          Set<Integer> set = new HashSet<>();
          for (int[] stone : stones) {
               set.add(find_parent(parent, stone[0]));
          }
          return stones.length - set.size();
     }

     void union(int[] parent, int x, int y) {
          int parX = find_parent(parent, x);
          int parY = find_parent(parent, y);
          if (parX != parY)
               parent[parY] = parX;
     }

     int find_parent(int[] parent, int ind) {
          if (parent[ind] == ind)
               return ind;
          return parent[ind] = find_parent(parent, parent[ind]);
     }

     public static void main(String[] args) {

     }
}