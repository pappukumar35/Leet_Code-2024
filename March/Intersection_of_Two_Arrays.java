import java.util.HashSet;
import java.util.Set;

class Intersection_of_Two_Arrays {
     public int[] intersection(int[] nums1, int[] nums2) {

          Set<Integer> set = new HashSet<>();
          for (int e : nums1) {
               set.add(e);
          }

          Set<Integer> set2 = new HashSet<>();
          for (int e : nums2) {
               set2.add(e);
          }

          set.retainAll(set2);
          int ans[] = new int[set.size()];
          int index = 0;
          for (int e : set) {
               ans[index] = e;
               index++;
          }
          return ans;
     }

     public static void main(String[] args) {

     }

}