package Task238_ProductOfArrayExceptSelf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        long time1 = System.nanoTime();
        int[] answer = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        long time2 = System.nanoTime();

        System.out.println(Arrays.toString(answer));
        System.out.println((time2 - time1) / 1000);
    }
}

