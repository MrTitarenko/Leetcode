package Task344_ReverseString;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        long time1 = System.nanoTime();
        String str = solution.reverseString("");
        long time2 = System.nanoTime();

        System.out.println(str);
    }
}

