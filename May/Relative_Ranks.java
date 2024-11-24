package May;

import java.util.*;

public class Relative_Ranks {
     public String[] findRelativeRanks(int[] score) {
          int n = score.length;
          int max = 0;
          for (int x : score) {
               if (x > max) {
                    max = x;
               }
          }
          int score_idx[] = new int[max + 1];
          for (int i = 0; i < n; i++) {
               score_idx[score[i]] = i + 1;
          }

          String rank[] = new String[n];
          int c = 1;
          String medals[] = { "Gold Medal", "Silver Medal", "Bronze Medal" };

          for (int i = max; i >= 0; i--) {
               if (score_idx[i] != 0) {
                    int org_idx = score_idx[i] - 1;
                    if (c < 4) {
                         rank[org_idx] = medals[c - 1];
                    } else {
                         rank[org_idx] = Integer.toString(c);
                    }
                    c++;
               }
          }
          return rank;
     }

     public static void main(String[] args) {

     }
}