package Task136_SingleNumber;

public class Solution3 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums)
            result ^= i;
        return result;
    }
}