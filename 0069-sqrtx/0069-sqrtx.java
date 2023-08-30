class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1 || x == 2 || x == 3) {
            return 1;
        }
        int i = 0;
        for (i = 2; i <= x / 2 + 1; i++) {
            int num = x / i;
            if (num == i) {
                return i;
            } if (i > num) {
                return i - 1;
            }
        }
        return i;
    }
}