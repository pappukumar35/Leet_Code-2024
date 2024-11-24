package Sepetember;

public class Design_a_Stack_With_Increment_Operation {
     int[] stack;
     int top = -1;

     public CustomStack(int maxSize) {
         this.stack = new int [maxSize];
     }

     public void push(int x) {
          if (top < this.stack.length - 1) {
               top++;
               this.stack[top] = x;
          }
     }

     public int pop() {
          if (top != -1) {
               return this.stack[top--];
          }
          return -1;
     }

     public void increment(int k, int val) {
          for (int i = 0; i < Math.min(k, top + 1); i++) {
               this.stack[i] += val;
          }
     }

     public static void main(String[] args) {

     }
}