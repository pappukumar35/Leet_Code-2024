import java.util.Arrays;

public class large_substring {
    public int maxLengthBetweenEqualCharacters(String s) {
        // array to store the first index of the 26 aplhabetic characters
        int firstIndex[] = new int[26];
        // initialize the firstIndex of each character to -1.
        // initialize a max variable with -1 to store the answer.
        Arrays.fill(firstIndex, -1);
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            // extract the character at i in variable c.
            char c = s.charAt(i);
            // if c is presented not presenting in substring means firstIndex[c - 'a'] ==
            // -1, update its firstIndex[c - 'a'] = i.
            // else calculate the answer and updae the max = Math.max(max, i - firstIndex[c
            // - 'a'] - 1);
            if (firstIndex[c - 'a'] == -1)
                firstIndex[c - 'a'] = i;
            else
                max = Math.max(max, i - firstIndex[c - 'a'] - 1);
        }
        // return max substring.
        return max;
    }
}
