package Task009_PalindromeNumber;

public class Main {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        Solution3 solution3 = new Solution3();
        Solution4 solution4 = new Solution4();
        boolean b;

        long time1 = System.nanoTime();
        b = solution4.isPalindrome(2345432);
        long time2 = System.nanoTime();

        System.out.println(2345432);
        System.out.println(b + " - " + (time2 - time1) / 100);
    }
}

