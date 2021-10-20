package singleDimensionArray;
import java.util.HashMap;
import java.util.Map;

public class SingleDimensionArray {
    public static int[] findTwoSum(int[] list, int sum) {
        if (list == null || list.length < 2) return null;
        //map values to indexes
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.length; i++) {
            indexMap.put(list[i], i);
        }

        for (int i = 0; i < list.length; i++) {
            int needed = sum - list[i];
            if (indexMap.get(needed) != null) {
                return new int[]{i, indexMap.get(needed)};
            }
        }

        //none found
        return null;
    }
}
    
