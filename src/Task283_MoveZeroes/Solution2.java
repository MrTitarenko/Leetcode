package Task283_MoveZeroes;

import java.util.Arrays;

public class Solution2 {
    public void moveZeroes(int[] nums) {
        System.arraycopy(
                Arrays.stream(nums).boxed().
                        sorted((a, b) -> {
                            if (a == 0) {
                                return 1;
                            }
                            if (b == 0) {
                                return -1;
                            }
                            return a - b;
                        }). // sort descending
                        mapToInt(i -> i).
                        toArray(), 0, nums, 0, nums.length);
    }
}