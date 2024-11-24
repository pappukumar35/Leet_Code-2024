class Minimum_Length_of_String_After_Deleting_Similar {
     public int minimumLength(String s) {
          int left = 0;
          int right = s.length() - 1;

          while (left < right && s.charAt(left) == s.charAt(right)) {
               char current = s.charAt(left);
               while (left <= right && s.charAt(left) == current) {
                    left++;
               }
               while (right >= left && s.charAt(right) == current) {
                    right--;
               }
          }

          return right - left + 1;
     }
}