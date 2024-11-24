package Aprial;

import java.io.*;
import java.util.*;

public class Number_of_Students_Unable_to_Eat_Lunch {
     public int countStudents(int[] students, int[] sandwiches) {

          int circleCount = 0;
          int squareCount = 0;

          for (int stud : students) {
               if (stud == 0) {
                    circleCount++;
               } else {
                    squareCount++;
               }
          }

          for (int sandwich : sandwiches) {

               if (sandwich == 0 && circleCount == 0) {
                    return squareCount;
               }
               if (sandwich == 1 && squareCount == 0) {
                    return circleCount;
               }
               if (sandwich == 0) {
                    circleCount--;
               } else {
                    squareCount--;
               }
          }
          return 0;
     }

     public static void main(String[] args) {
          System.out.println();

     }

}
