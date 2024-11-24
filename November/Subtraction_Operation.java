package NOvember;

import java.util.ArrayList;
import java.util.List;

public class Subtraction_Operation {
     public boolean primeSubOperation(int[] numbers) {
          int largestNumber = 0;
          for (int number : numbers) {
               largestNumber = Math.max(largestNumber, number);
          }

          boolean[] primeSieve = new boolean[largestNumber + 1];
          primeSieve[0] = primeSieve[1] = true;
          for (int i = 2; i * i <= largestNumber; i++) {
               if (!primeSieve[i]) {
                    for (int j = 2 * i; j <= largestNumber; j += i) {
                         primeSieve[j] = true;
                    }
               }
          }

          List<Integer> primeNumbers = new ArrayList<>();
          for (int i = 2; i < primeSieve.length; i++) {
               if (!primeSieve[i]) {
                    primeNumbers.add(i);
               }
          }

          int index = findMaxSubtraction(primeNumbers, 0, numbers[0]);
          if (index != -1) {
               numbers[0] -= primeNumbers.get(index);
          }

          for (int i = 1; i < numbers.length; i++) {
               index = findMaxSubtraction(primeNumbers, numbers[i - 1], numbers[i]);

               if (index == -1 && numbers[i] <= numbers[i - 1]) {
                    return false;
               } else if (index != -1) {
                    numbers[i] -= primeNumbers.get(index);
               }
          }

          return true;
     }

     private int findMaxSubtraction(List<Integer> primes, int previousValue, int currentValue) {
          if (primes.size() == 0) {
               return -1;
          }

          int leftIndex = 0;
          int rightIndex = primes.size() - 1;
          int midIndex;

          while (leftIndex <= rightIndex) {
               midIndex = (leftIndex + rightIndex) / 2;

               if (currentValue - primes.get(midIndex) <= previousValue) {
                    rightIndex = midIndex - 1;
               } else {
                    if (midIndex == primes.size() - 1 || currentValue - primes.get(midIndex + 1) <= previousValue) {
                         return midIndex;
                    } else {
                         leftIndex = midIndex + 1;
                    }
               }
          }

          midIndex = rightIndex;
          if (midIndex >= 0 && currentValue - primes.get(midIndex) <= previousValue) {
               return -1;
          } else {
               return midIndex;
          }
     }

     public static void main(String[] args) {

     }
}