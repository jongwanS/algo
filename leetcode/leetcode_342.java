package leetcode;

class Solution342 {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return (n > 1) ? false : true;
    }
}