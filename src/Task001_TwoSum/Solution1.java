package Task001_TwoSum;

public class Solution1 implements TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int k = 0; k < nums.length - 1; k++) {
            for (int l = k+1; l < nums.length; l++) {
                if (nums[k] + nums[l] == target) {
                    res[0] = k;
                    res[1] = l;
                }
            }
        }
        return res;
    }
}