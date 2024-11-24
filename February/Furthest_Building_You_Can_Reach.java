class Furthest_Building_You_Can_Reach {
     public int furthestBuilding(int[] heights, int bricks, int ladders) {
          int n = heights.length;
          return solve(heights, 0, bricks, ladders);
     }

     public int solve(int[] heights, int i, int bricks, int ladders) {
          if (i == heights.length - 1)
               return i;
          int diff = heights[i + 1] - heights[i];
          if (diff > 0) {
               int ans = i;
               if (bricks >= diff) {
                    ans = Math.max(ans, solve(heights, i + 1, bricks - diff, ladders));
               }
               if (ladders > 0) {
                    ans = Math.max(ans, solve(heights, i + 1, bricks, ladders - 1));
               }
               return ans;
          } else {
               return solve(heights, i + 1, bricks, ladders);
          }
     }
}