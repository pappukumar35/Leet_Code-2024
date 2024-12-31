package December;

public class Tickets {
     public int mincostTickets(int[] days, int[] costs) {
          int[] dp = new int[days[days.length - 1] + 1];
          int travelIndex = 0;

          for (int i = 1; i < dp.length; i++) {
               if (i != days[travelIndex]) {
                    dp[i] = dp[i - 1];
               } else {
                    int cost1 = dp[i - 1] + costs[0];
                    int cost7 = dp[Math.max(0, i - 7)] + costs[1];
                    int cost30 = dp[Math.max(0, i - 30)] + costs[2];
                    dp[i] = Math.min(cost1, Math.min(cost7, cost30));
                    travelIndex++;
               }
          }

          return dp[days[days.length - 1]];
     }

     public static void main(String[] args) {

     }
}