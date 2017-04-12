package Task202_HappyNumber;

public class Solution1 {
    public boolean isHappy(int n) {
        while (n > 6) {
            int k = 0;
            while (n > 0) {
                k += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            n = k;
        }
        return n == 1;
    }
}