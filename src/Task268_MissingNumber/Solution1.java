package Task268_MissingNumber;

import java.util.Arrays;

public class Solution1 {
    public int missingNumber(int[] nums) {
        int k = 0;
        Arrays.sort(nums);
        for (int i : nums) {
            if (i != k) {
                return k;
            }
            k++;
        }
        return nums.length;
    }
}