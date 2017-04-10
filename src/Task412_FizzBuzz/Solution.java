package Task412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> stringList = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                stringList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                stringList.add("Fizz");
            } else if (i % 5 == 0) {
                stringList.add("Buzz");
            } else
                stringList.add(String.valueOf(i));
        }
        return stringList;
    }
}