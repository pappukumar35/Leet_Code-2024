package June;

import java.util.*;

public class Most_Profit_Assigning_Work {
     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
          int maxDifficulty = 0;
          for (int d : difficulty) {
               maxDifficulty = Math.max(maxDifficulty, d);
          }

          int[] maxProfitUpToDifficulty = new int[maxDifficulty + 1];
          for (int i = 0; i < difficulty.length; i++) {
               maxProfitUpToDifficulty[difficulty[i]] = Math.max(maxProfitUpToDifficulty[difficulty[i]], profit[i]);
          }

          for (int i = 1; i <= maxDifficulty; i++) {
               maxProfitUpToDifficulty[i] = Math.max(maxProfitUpToDifficulty[i], maxProfitUpToDifficulty[i - 1]);
          }

          int totalProfit = 0;
          for (int ability : worker) {
               if (ability > maxDifficulty) {
                    totalProfit += maxProfitUpToDifficulty[maxDifficulty];
               } else {
                    totalProfit += maxProfitUpToDifficulty[ability];
               }
          }

          return totalProfit;
     }

     public static void main(String[] args) {

     }
}