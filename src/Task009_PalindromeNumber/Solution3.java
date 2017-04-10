package Task009_PalindromeNumber;

public class Solution3 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = x + "";
        int numLength = str.length();
        int lng = numLength - 1;
        for (int i = 1; i <= numLength / 2; i++) {
            if ((x / (int) Math.pow(10, lng)) != x % 10) {
                return false;
            }
            x %= (int) Math.pow(10, lng);
            x /= 10;
            lng -= 2;
        }

        return true;
    }
}
