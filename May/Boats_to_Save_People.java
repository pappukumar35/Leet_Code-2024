package May;

import java.util.*;
import java.util.*;

public class Boats_to_Save_People {
     public int numRescueBoats(int[] people, int limit) {
          // Sort the array to simplify the boat allocation process
          Arrays.sort(people);

          // Initialize two pointers, one at the beginning and one at the end of the array
          int left = 0; // Pointer for the lightest person
          int right = people.length - 1; // Pointer for the heaviest person
          int boatsCount = 0; // Count of boats required

          // Iterate until both pointers meet or cross each other
          while (left <= right) {
               // If both the lightest and heaviest persons can fit in the same boat
               if (people[left] + people[right] <= limit) {
                    boatsCount++; // Allocate a boat
                    left++; // Move to the next lightest person
                    right--; // Move to the next heaviest person
               }
               // If only the heaviest person can fit in a boat
               else if (people[right] <= limit) {
                    boatsCount++; // Allocate a boat
                    right--; // Move to the next heaviest person
               }
          }

          return boatsCount; // Return the total count of boats required
     }

     public static void main(String[] args) {

     }
}