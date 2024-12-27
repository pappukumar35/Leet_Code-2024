package December;

public class Sightseeing_Pair {
     public int maxScoreSightseeingPair(int[] values) {
          int n = values.length;
          int[] leftMax = new int[n];
          int[] rightMax = new int[n];

          // Compute leftMax array
          leftMax[0] = values[0];
          for (int i = 1; i < n; i++) {
               leftMax[i] = Math.max(leftMax[i - 1], values[i] + i);
          }

          // Compute rightMax array
          rightMax[n - 1] = values[n - 1] - (n - 1);
          for (int i = n - 2; i >= 0; i--) {
               rightMax[i] = Math.max(rightMax[i + 1], values[i] - i);
          }

          // Compute the maximum score
          int maxi = 0;
          for (int i = 1; i < n; i++) {
               maxi = Math.max(maxi, leftMax[i - 1] + rightMax[i]);
          }

          return maxi;
     }

     public static void main(String[] args) {

     }
}
