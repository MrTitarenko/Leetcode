package Task268_MissingNumber;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        long time1 = System.nanoTime();
        int answer = solution.missingNumber(new int[]{0,1,2,3,5});
        long time2 = System.nanoTime();

        System.out.println(answer);
//        System.out.println((time2 - time1) / 1000);
    }
}

