package Task136_SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)){
                set.remove(i);
            }
        }
        return set.iterator().next();
    }
}