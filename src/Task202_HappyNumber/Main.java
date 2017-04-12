package Task202_HappyNumber;

public class Main {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        long time1 = System.nanoTime();
        boolean answer = solution.isHappy(2);
        long time2 = System.nanoTime();

        System.out.println(answer);
        System.out.println((time2-time1)/1000);
    }
}

