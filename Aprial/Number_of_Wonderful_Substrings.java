package Aprial;

import java.util.*;

public class Number_of_Wonderful_Substrings {
     public long wonderfulSubstrings(String word) {

          int count[] = new int[1024];
          int mask = 0;
          count[0] = 1;

          long ans = 0;
          for (char c : word.toCharArray()) {
               mask ^= 1 << (c - 'a');
               ans += count[mask];
               for (int i = 0; i < 10; i++) {
                    ans += count[mask ^ (1 << i)];
               }
               count[mask]++;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}