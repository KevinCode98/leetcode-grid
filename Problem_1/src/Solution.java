import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i]))
                return new int[]{myMap.get(nums[i]), i};
            myMap.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
