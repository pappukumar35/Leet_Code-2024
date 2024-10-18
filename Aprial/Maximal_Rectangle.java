import java.io.*;
import java.util.*;

public class Maximal_Rectangle {
     public int maximalRectangle(char[][] matrix) {
          if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
               return 0;
          }

          int n = matrix[0].length;
          int[] curRow = new int[n];
          int maxAns = 0; // Initialize the maximum answer

          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1') {
                         curRow[j] += 1;
                    } else {
                         curRow[j] = 0;
                    }
               }

               // Calculate the largest area in histogram for the current row
               int curAns = largestAreaHistogram(curRow);

               // Update maxAns with the maximum of maxAns and curAns
               maxAns = Math.max(maxAns, curAns);
          }

          return maxAns;
     }

     private int largestAreaHistogram(int a[]) {
          int n = a.length;
          ArrayDeque<Integer> st = new ArrayDeque<>();
          int[] leftSmall = new int[n];
          int[] rightSmall = new int[n];

          // Calculate leftSmalls
          for (int i = 0; i < n; i++) {
               while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                    st.pop();
               }
               leftSmall[i] = st.isEmpty() ? 0 : st.peek() + 1;
               st.push(i);
          }

          // Clear the stack
          st.clear();

          // Calculate rightSmalls
          for (int i = n - 1; i >= 0; i--) {
               while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                    st.pop();
               }
               rightSmall[i] = st.isEmpty() ? n - 1 : st.peek() - 1;
               st.push(i);
          }

          // Calculate the maximum area
          int maxA = 0;
          for (int i = 0; i < n; i++) {
               maxA = Math.max(maxA, a[i] * (rightSmall[i] - leftSmall[i] + 1));
          }
          return maxA;
     }

     public static void main(String[] args) {

     }

}
