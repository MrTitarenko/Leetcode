package Task009_PalindromeNumber;

public class Solution1 {
    public boolean isPalindrome(int x) {
        int num = x;
        long newX = 0;
        while (num > 0) {
            newX = newX * 10 + num % 10;
            num /= 10;
        }
        return x == newX;
    }
}
