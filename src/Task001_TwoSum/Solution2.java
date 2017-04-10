package Task001_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 implements TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                int delta = target - nums[i];
                if (map.containsKey(delta)) {
                    return new int[]{map.get(delta), i};
                }
                map.put(nums[i], i);
            }
        }
        return res;
    }
}