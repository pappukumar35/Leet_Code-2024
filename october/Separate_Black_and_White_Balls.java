package october;
public class Separate_Black_and_White_Balls{
     public long minimumSteps(String s) {
          long whiteCount = 0;
          long swaps = 0;      
  
          for (int i = s.length() - 1; i >= 0; i--) {
              if (s.charAt(i) == '0') {
                  whiteCount++;
              } else {
                  swaps += whiteCount;
              }
          }
  
          return swaps; 
      }
     public static void main(String[] args) {
          
     }
}