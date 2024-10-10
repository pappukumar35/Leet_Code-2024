package Aprial;

import java.util.*;

public class Time_Needed_to_Buy_Tickets {
     public int timeRequiredToBuy(int[] tickets, int k) {
          int value = tickets[k];
          int seconds = 0;
          for (int i = 0; i < tickets.length; i++) {
               int max = (i <= k) ? value : value - 1;
               seconds += (tickets[i] > max) ? max : tickets[i];
          }
          return seconds;
     }

     public static void main(String[] args) {

     }

}
