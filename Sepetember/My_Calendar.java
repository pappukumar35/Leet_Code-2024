package Sepetember;

import java.util.ArrayList;
import java.util.List;

public class My_Calendar {
     List<int[]> intervals;

    public MyCalendar() {
        intervals = new ArrayList();
    }

     boolean isIntersecting(int[] interval1, int[] interval2) {
          if (interval1[0] >= interval2[0] && interval1[0] < interval2[1])
               return true;
          if (interval1[1] > interval2[0] && interval1[1] <= interval2[1])
               return true;
          return false;

     }

     public boolean book(int start, int end) {
          int[] currInterval = { start, end };
          for (int[] interval : intervals) {
               if (isIntersecting(interval, currInterval))
                    return false; // check if "first intersects second"
               if (isIntersecting(currInterval, interval))
                    return false; // check if "second intersects first"
          }
          intervals.add(currInterval);
          return true;

     }

     public static void main(String[] args) {

     }
}