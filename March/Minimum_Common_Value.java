class Minimum_Common_Value {
     public int getCommon(int[] nums1, int[] nums2) {
          int i = 0, j = 0;
          int n = nums1.length;
          int m = nums2.length;

          while (i < n && j < m) {
               if (nums1[i] == nums2[j])
                    return nums1[i];
               else if (nums1[i] > nums2[j])
                    j++;
               else
                    i++;
          }

          return -1;
     }

     public static void main(String[] args) {

     }

}