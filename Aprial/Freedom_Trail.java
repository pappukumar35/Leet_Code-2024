package Aprial;

import java.util.*;

public class Freedom_Trail {
     public Integer dp[][][];

     public int findRotateSteps(String ring, String key) {
          dp = new Integer[ring.length()][key.length()][2];

          // 0 means clockwise
          // 1 means anti clockwise

          // We will return min of both
          // If we go in clockwise currentDirectionection - denoted by 1
          // If we go in anti clockwise currentDirectionect - denoted by 2
          return Math.min(helper(ring, key, 0, 0, 0), helper(ring, key, 0, 0, 1));
     }

     public int helper(String ring, String key, int indexOfRing, int indexOfKey, int currentDirection) {
          // Base case
          // If we have reached the end of key string
          // Meaning we have Opened the door
          if (indexOfKey >= key.length())
               return 0;

          // If the dial and the key char matches
          // Meaning we can press the button
          // Pressing the button will add 1 number of step
          // After pressing the button for the specific letter
          // We can either go forward, meaning rotate dial clockwise
          // Or backwards meaning rotate dial anti-clockwise to find the next letter in
          // key
          // But we will only return the minimum of both
          if (ring.charAt(indexOfRing) == key.charAt(indexOfKey))
               return dp[indexOfRing][indexOfKey][currentDirection] = 1
                         + Math.min(helper(ring, key, indexOfRing, indexOfKey + 1, 1),
                                   helper(ring, key, indexOfRing, indexOfKey + 1, 0));

          if (dp[indexOfRing][indexOfKey][currentDirection] != null)
               return dp[indexOfRing][indexOfKey][currentDirection];
          int frwrd = 0;
          int bckwrd = 0;

          // If we previously rotate the dial clockwise then we must rotate it in
          // clockwise currentDirectionection only
          // Rotating it in anti clockwise will just be useless as it will enter never
          // ending loop, I will explain why....

          // For example, i am at 5th index which is the last index of my ring
          // And i rotate it forward meaning I got to the 0th index of the ring
          // Now at this 0th ending I will agian have 2 choices,
          // Either I rotate it clockwise or anti-clockwise
          // Now, If I try to do both without considering the previous
          // currentDirectionection
          // I will rotate it anti clockwise, making the index back to 5th index of my
          // ring
          // Hence resulting in a endless loop
          // So, ALWAYS CONSIDER THE currentDirectionECTION

          // If previous currentDirectionection is clockwise rotate it further clockwise
          if (currentDirection == 0 && indexOfRing >= 0 && indexOfRing < (ring.length() - 1))
               frwrd = 1 + helper(ring, key, indexOfRing + 1, indexOfKey, currentDirection);

          // Handles the edge case where we are at the last index of ring and we want to
          // further rotate it clocwise
          // So our next index should be 1st index of ring
          else if (currentDirection == 0 && indexOfRing == (ring.length() - 1))
               frwrd = 1 + helper(ring, key, 0, indexOfKey, currentDirection);

          // If previous currentDirectionection is anti-clockwise rotate it further
          // anti-clockwise
          if (currentDirection == 1 && indexOfRing >= 1 && indexOfRing < ring.length())
               bckwrd = 1 + helper(ring, key, indexOfRing - 1, indexOfKey, currentDirection);

          // Handles the edge case where we are at the first index of ring and we want to
          // further rotate it anti-clocwise
          // So our next index should be last index of ring
          else if (currentDirection == 1 && indexOfRing == 0)
               bckwrd = 1 + helper(ring, key, ring.length() - 1, indexOfKey, currentDirection);

          // It is clear that we cannot go both forward and backward
          // So return which is not 0
          return dp[indexOfRing][indexOfKey][currentDirection] = frwrd == 0 ? bckwrd : frwrd;
     }

     public static void main(String[] args) {

     }

}
