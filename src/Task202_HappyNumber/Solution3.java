package Task202_HappyNumber;

public class Solution3 {
    public boolean isHappy(int n) {
        int x = n, y = n;
        while (x > 1) {
            x = cal(x);
            y = cal(cal(y));
            if (x == 1 || y == 1) return true;
            if (x == y) return false;
        }
        return true;
    }

    private int cal(int n) {
        int s = 0;
        while (n > 0) {
            s += (n % 10) * (n % 10);
            n /= 10;
        }
        return s;
    }
}