package Task007_ReverseInteger;

public class Solution1 {
    public int reverse(int x) {
        long newX = 0;
        while (x != 0) {
            newX = newX * 10 + x % 10;
            x /= 10;
        }
        return (newX > Integer.MAX_VALUE || newX < Integer.MIN_VALUE) ? 0 : (int) newX;
    }
}
