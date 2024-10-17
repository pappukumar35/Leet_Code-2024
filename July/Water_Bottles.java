package July;

import java.util.*;

public class Water_Bottles {
     public int numWaterBottles(int numBottles, int numExchange) {
          int totalBottles = numBottles;

          while (numBottles >= numExchange) {
               totalBottles += numBottles / numExchange;
               numBottles = (numBottles / numExchange) + (numBottles % numExchange);
          }

          return totalBottles;
     }

     public static void main(String[] args) {

     }
}