package May;

import java.util.*;

public class Student_Attendance_Record_II {
     private static final long MOD = (int) (1e9) + 7;

     public int checkRecord(int n) {
          final var dpn = new long[] { 1, 2, 4 };
          final var dpa = new long[] { 1, 3, 8 };

          for (var i = 3; i <= n; ++i) {
               dpn[i % 3] = (dpn[(i - 1) % 3] + dpn[(i - 2) % 3] + dpn[(i - 3) % 3]) % MOD;
               dpa[i % 3] = (dpa[(i - 1) % 3] + dpa[(i - 2) % 3] + dpa[(i - 3) % 3] + dpn[i % 3]) % MOD;
          }

          return (int) dpa[n % 3];
     }

     public static void main(String[] args) {

     }
}