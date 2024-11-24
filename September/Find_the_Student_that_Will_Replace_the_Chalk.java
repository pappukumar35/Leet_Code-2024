package September;
public class Find_the_Student_that_Will_Replace_the_Chalk{
     public int chalkReplacer(int[] chalk, int initialChalkPieces) {
          long totalChalkNeeded = 0;
          for (int studentChalkUse : chalk) {
              totalChalkNeeded += studentChalkUse;
          }
          
          int remainingChalk = (int)(initialChalkPieces % totalChalkNeeded);
          
          for (int studentIndex = 0; studentIndex < chalk.length; studentIndex++) {
              if (remainingChalk < chalk[studentIndex]) {
                  return studentIndex;
              }
              remainingChalk -= chalk[studentIndex];
          }
          
          return 0;  
      }
     public static void main(String[] args) {
          
     }
}