package December;

public class Maximum_Number {
     public int maxCount(int[] banned, int n, int maxSum) {
          Set<Integer> bannedSet = new HashSet<>();
          for (int num : banned) {
               bannedSet.add(num);
          }

          int sum = 0, count = 0;
          for (int i = 1; i <= n; i++) {
               if (!bannedSet.contains(i) && sum + i <= maxSum) { // Skip banned numbers
                    sum += i;
                    count++;
               }
          }

          return count;
     }

     public static void main(String[] args) {

     }
}