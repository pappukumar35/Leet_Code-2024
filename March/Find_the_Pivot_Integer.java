class Find_the_Pivot_Integer {
     public int pivotInteger(int n) {
          if (n == 1)
               return 1;
          int left[] = new int[n];
          int right[] = new int[n];
          int a = 1;
          for (int i = 0; i < left.length; i++) {
               left[i] = a;
               right[i] = a;
               a++;
          }
          for (int i = 1; i < left.length; i++) {
               left[i] = left[i] + left[i - 1];
          }
          for (int i = right.length - 2; i >= 0; i--) {
               right[i] = right[i + 1] + right[i];
          }

          for (int i = 1; i < left.length; i++) {
               if (left[i] == right[i]) {
                    return i + 1;
               }
          }

          return -1;
     }

     public static void main(String[] args) {

     }
}