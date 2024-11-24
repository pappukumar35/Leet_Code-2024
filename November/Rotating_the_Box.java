package November;

public class Rotating_the_Box {
     public char[][] rotateTheBox(char[][] box) {
          int m = box.length, n = box[0].length;
          char[][] res = new char[n][m];
          for (int i = 0; i < m; ++i)
               for (int j = n - 1, k = n - 1; j >= 0; --j) {
                    res[j][m - i - 1] = '.';
                    if (box[i][j] != '.') {
                         k = box[i][j] == '*' ? j : k;
                         res[k--][m - i - 1] = box[i][j];
                    }
               }
          return res;
     }

     public static void main(String[] args) {

     }
}