package october;

import java.util.*;

public class Maximum_Width_Ramp {
     public int maxWidthRamp(int[] A) {
          Stack<Integer> stack = new Stack<>(); // Stack to store indices of the potential starting points for ramps
          int res = 0; // Variable to store the maximum width of the ramp
          int n = A.length;

          // First pass: find all possible ramp start indices
          for (int i = 0; i < n; ++i) {
               // We push indices into the stack where the current element is smaller than
               // or equal to the top element of the stack (i.e., decreasing order).
               if (stack.isEmpty() || A[stack.peek()] > A[i]) {
                    stack.push(i);
               }
          }

          // Second pass: try to form the widest ramp by checking the indices from the end
          for (int i = n - 1; i > res; --i) {
               // While stack is not empty and we can form a valid ramp, calculate the width
               while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                    // Calculate width and update the result
                    res = Math.max(res, i - stack.peek());
                    stack.pop(); // Remove the used index from the stack
               }
          }

          return res; // Return the maximum width of the ramp
     }

     public static void main(String[] args) {

     }
}