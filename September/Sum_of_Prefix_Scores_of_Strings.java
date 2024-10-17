package September;

public class Sum_of_Prefix_Scores_of_Strings {
     class TrieNode {
          TrieNode[] child = new TrieNode[26];
          int count = 0;
     }

     public int[] sumPrefixScores(String[] words) {
          TrieNode root = new TrieNode();
          int[] result = new int[words.length];

          for (String item : words)
               addToRoot(0, item.toCharArray(), root);

          for (int i = 0; i < words.length; i++)
               result[i] = getCount(0, words[i].toCharArray(), root);

          return result;
     }

     void addToRoot(int index, char[] arr, TrieNode root) {
          if (index == arr.length)
               return;

          int word = arr[index] - 'a';
          if (root.child[word] == null)
               root.child[word] = new TrieNode();

          root.child[word].count++;
          addToRoot(index + 1, arr, root.child[word]);
     }

     int getCount(int index, char[] arr, TrieNode root) {
          if (index == arr.length)
               return 0;

          int word = arr[index] - 'a';
          return root.child[word].count + getCount(index + 1, arr, root.child[word]);
     }

     public static void main(String[] args) {

     }
}