import java.util.*;

class Task_Scheduler {
     public int leastInterval(char[] tasks, int n) {
          int[] taskFreqMp = new int[26];
          for (char c : tasks) {
               taskFreqMp[c - 'A']++;
          }
          Arrays.sort(taskFreqMp);
          int batchCnt = taskFreqMp[25];
          int vacantSlots = --batchCnt * n;
          for (int indx = 0; indx < 25; indx++) {
               vacantSlots -= Math.min(taskFreqMp[indx], batchCnt);
          }
          return vacantSlots > 0 ? tasks.length + vacantSlots : tasks.length;
     }

     public static void main(String[] args) {

     }
}