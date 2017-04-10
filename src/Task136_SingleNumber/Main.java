package Task136_SingleNumber;

public class Main {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        long time1 = System.nanoTime();
        int str = solution.singleNumber(new int[]{1, 2, 3, 2, 11, 7, 3, 5, 5, 11, 1});
        long time2 = System.nanoTime();

        System.out.println(str);
        System.out.println((time2-time1)/1000);
    }
}

