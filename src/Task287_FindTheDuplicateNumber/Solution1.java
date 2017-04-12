package Task287_FindTheDuplicateNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i : nums) {
            if (!set.add(i)) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }
}