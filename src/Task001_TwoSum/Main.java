package Task001_TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum solution1 = new Solution1();
        TwoSum solution2 = new Solution2();
        int[] sol;
        int[] arr = new int[]{2, 4, 45, 226, 454, 55, 4, 8, 9, 25, 64, 52, 456, 6, 8, 7, 11, 15};

        long time1 = System.nanoTime();
        sol = solution1.twoSum(arr, 9);
        sol = solution2.twoSum(arr, 9);
        long time2 = System.nanoTime();

        System.out.println(Arrays.toString(sol) + " - " + (time2 - time1)/100);
    }
}

