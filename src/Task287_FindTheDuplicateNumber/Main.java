package Task287_FindTheDuplicateNumber;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        long time1 = System.nanoTime();
        int answer = solution.findDuplicate(new int[]{5, 3, 1, 4, 5, 2});
        long time2 = System.nanoTime();

        System.out.println(answer);
        System.out.println((time2 - time1) / 1000);
    }
}

