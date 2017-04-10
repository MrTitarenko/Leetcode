package Task007_ReverseInteger;


public class Main {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int k;

        long time1 = System.nanoTime();
        k = solution1.reverse(1534236469);
        long time2 = System.nanoTime();

        System.out.println("Was: " + 1534236469);
        System.out.println("Get: " + k + " - " + (time2 - time1) / 100);
    }
}

