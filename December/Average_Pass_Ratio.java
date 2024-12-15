
import java.util.*;

public class Average_Pass_Ratio {
     public double maxAverageRatio(int[][] c, int e) {
          PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
               double a1 = (double) (a[0]) / (double) (a[1]);
               double a2 = (double) (a[0] + 1) / (double) (a[1] + 1);
               double b1 = (double) (b[0]) / (double) (b[1]);
               double b2 = (double) (b[0] + 1) / (double) (b[1] + 1);
               b1 = Math.abs(b1 - b2);
               a1 = Math.abs(a1 - a2);
               // System.out.println(a1+" "+b1);
               if (a1 == b1) {
                    return a[0] - b[0];
               } else
                    return Double.compare(b1, a1);
          });
          for (int[] it : c) {
               pq.offer(it);
          }
          while (e > 0) {
               int[] x = pq.poll();
               // if(pq.size()>0){
               // int[]y=pq.poll();
               // double yy=(double)(y[0]+1)/(1+y[1]);
               double xx = (double) (x[0] + 1) / (x[1] + 1);
               /*
                * if(xx>yy){
                * pq.offer(x);
                * pq.offer(new int[]{y[0]+1,y[1]+1});
                * }
                * else{
                * pq.offer(y);
                * pq.offer(new int[]{x[0]+1,x[1]+1});
                * }
                * e--;
                * }
                * else{
                * 
                * }
                */
               x[0]++;
               x[1]++;
               pq.offer(x);
               e--;
          }
          double ans = 0;

          while (pq.size() > 0) {
               int[] x = pq.poll();

               double xx = ((double) (x[0]) / (double) (x[1]));

               xx = Math.round(xx * 100000.0) / 100000.0;
               ans += xx;
               // System.out.println(x[0]+" "+x[1]+" "+xx+" "+ans);
          }
          return ans / c.length;
     }

     public static void main(String[] args) {

     }
}