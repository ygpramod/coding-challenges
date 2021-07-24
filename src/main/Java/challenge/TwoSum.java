package challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public int[] findPair(List<Integer> integers, int sum) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < integers.size(); i++) {
            Integer key = integers.get(i);
            if(store.containsKey(key)){
                return new int[]{store.get(key), i};
            }
            store.put(sum - key, i);
        }
        return new int[]{-1, -1};
    }
}
