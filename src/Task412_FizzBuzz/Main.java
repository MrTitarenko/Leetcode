package Task412_FizzBuzz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        long time1 = System.nanoTime();
        List<String> stringList = solution.fizzBuzz(15);
        long time2 = System.nanoTime();

        System.out.println(stringList);
    }
}

