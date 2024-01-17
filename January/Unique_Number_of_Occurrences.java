import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); // O(1)

        for (int i : arr) // -----------------------------------------/
        { //
            map.put(i, map.getOrDefault(i, 0) + 1); // O(1) average time / --- O(n) for n elements in array
        } // ---------------------------------------------------------/

        Set<Integer> set = new HashSet<>(map.values()); // O(n) -> n is the no. of values in the map
        return (set.size() == map.size()); // O(1)
    }

}