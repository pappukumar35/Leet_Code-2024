import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions {
    public List<List<Integer>> findMatrix(int[] v) {
        Map<Integer, Integer> um = new HashMap<>();
        for (int i : v) {
            um.put(i, um.getOrDefault(i, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        while (!um.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> toErase = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : um.entrySet()) {
                int f = entry.getKey();
                int s = entry.getValue();
                temp.add(f);
                s--;
                if (s == 0) {
                    toErase.add(f);
                }
                um.put(f, s);
            }
            ans.add(temp);
            for (int i : toErase) {
                um.remove(i);
            }
        }
        return ans;
    }
}
