package L21_HashMaps_And_HashSets;

import java.util.*;

public class C4_MissingElementInRange {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (low > high) return ans;

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (x >= low && x <= high)
                set.add(x);
        }

        for (int i = low; i <= high; i++) {
            if (!set.contains(i))
                ans.add(i);
        }

        return ans;
    }
}
