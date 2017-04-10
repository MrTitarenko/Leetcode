package Task283_MoveZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int[] arr = new int[]{1, 0, 3, 2, 0, 7, -3, 5, 0, 11, 1};
        long time1 = System.nanoTime();
        solution.moveZeroes(arr);
        long time2 = System.nanoTime();

        System.out.println(Arrays.toString(arr));
        System.out.println((time2 - time1) / 1000);
    }
}

