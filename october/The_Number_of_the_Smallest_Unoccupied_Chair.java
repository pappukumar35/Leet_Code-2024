package october;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class The_Number_of_the_Smallest_Unoccupied_Chair {
     public int smallestChair(int[][] times, int targetFriend) {
          TreeSet<Integer> availSeats = new TreeSet<>();
          int seatNumber = 0;
          PriorityQueue<Pair<Integer, Integer>> occupSeats = new PriorityQueue<>((a, b) -> (a.getKey() - b.getKey()));
          int trgtFrndArrTime = times[targetFriend][0];
          Arrays.sort(times, (a, b) -> (a[0] - b[0]));
          for (var timeEntry : times) {
               int arrTime = timeEntry[0], leavTime = timeEntry[1];
               while (!occupSeats.isEmpty() && occupSeats.peek().getKey() <= arrTime) {
                    var seatEntry = occupSeats.poll();
                    int vacSeatNum = seatEntry.getValue();
                    availSeats.add(vacSeatNum);
               }
               if (availSeats.isEmpty()) {
                    if (arrTime == trgtFrndArrTime)
                         return seatNumber;
                    occupSeats.add(new Pair<Integer, Integer>(leavTime, seatNumber++));
               } else {
                    int firstSeatAv = availSeats.first();
                    if (arrTime == trgtFrndArrTime)
                         return firstSeatAv;
                    occupSeats.add(new Pair<Integer, Integer>(leavTime, firstSeatAv));
                    availSeats.remove(firstSeatAv);
               }
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}