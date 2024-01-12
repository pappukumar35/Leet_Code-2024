import java.util.ArrayList;
import java.util.HashMap;

class Arithmetic_Slices {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        HashMap<Long, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long temp = nums[i];
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<Integer>());
            }
            map.get(temp).add(i);
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long a = 2L * nums[i] - nums[j];
                if (map.containsKey(a)) {
                    for (int k : map.get(a)) {
                        if (k < i) {
                            dp[i][j] += dp[k][i] + 1;
                        } else {
                            break;
                        }
                    }
                }
                sum += dp[i][j];
            }
        }
        return sum;
    }
}