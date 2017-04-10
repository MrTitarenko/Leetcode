package Task009_PalindromeNumber;

public class Solution2 {
    public boolean isPalindrome(int x) {
        String num = x + "";
        StringBuffer str = new StringBuffer(num);
        str.reverse();
        return num.equals(String.valueOf(str));
    }
}
