package May;

public class K_th_Smallest_Prime_Fraction {
     public int[] kthSmallestPrimeFraction(int[] arr, int k) {
          // Priority queue to store fractions with comparator to sort by fraction value
          PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> Integer.compare(arr[a[0]] * arr[b[1]], arr[a[1]] * arr[b[0]]));

          // Initialize the heap with the first possible fraction from each numerator
          for (int i = 0; i < arr.length - 1; i++) {
               pq.add(new int[] { i, arr.length - 1 });
          }

          // Extract the smallest fraction k-1 times to reach the k-th smallest
          for (int i = 1; i < k; i++) {
               int[] frac = pq.poll();
               int numeratorIndex = frac[0];
               int denominatorIndex = frac[1];

               // Push the next fraction with the same numerator and the next smaller
               // denominator
               if (denominatorIndex - 1 > numeratorIndex) {
                    pq.add(new int[] { numeratorIndex, denominatorIndex - 1 });
               }
          }

          // The k-th smallest fraction's indices after popping k-1 elements
          int[] result = pq.poll();
          return new int[] { arr[result[0]], arr[result[1]] };
     }

     public static void main(String[] args) {

     }
}