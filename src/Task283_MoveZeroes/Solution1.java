package Task283_MoveZeroes;

public class Solution1 {
    public void moveZeroes(int[] nums) {
        for (int i = 0, k = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[k];
                nums[k] = nums[i];
                nums[i] = tmp;
                k++;
            }
        }
    }
}