import java.util.LinkedList;

class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do {
            s = square(s);
            f = square(square(f));
        } while (s != f);

        return s == 1;
    }
    public int square(int num) {
        int ans = 0;
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }
}