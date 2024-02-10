class Number_of_paths_in_a_matrix_with_k_coins {
          long numberOfPath(int n, int k, int[][] arr) {
                    // code here
                    long res = count(0, 0, 0, arr, n, k);
                    return res;
          }

          static long count(int sum, int i, int j, int arr[][], int n, int k) {
                    if (i == n || j == n)
                              return 0;
                    sum += arr[i][j];
                    if (sum == k && (i == n - 1 && j == n - 1)) {
                              return 1;
                    }
                    if (sum > k)
                              return 0;

                    long a = count(sum, i + 1, j, arr, n, k);
                    long b = count(sum, i, j + 1, arr, n, k);

                    return a + b;

          }
}