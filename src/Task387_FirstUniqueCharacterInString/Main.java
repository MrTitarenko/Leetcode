package Task387_FirstUniqueCharacterInString;

public class Main {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        long time1 = System.nanoTime();
        int answer = solution.firstUniqChar("loveleetcode");
        long time2 = System.nanoTime();

        System.out.println(answer);
        System.out.println((time2-time1)/1000);
    }
}

