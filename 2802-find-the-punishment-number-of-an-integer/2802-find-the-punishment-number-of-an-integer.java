class Solution {
    public boolean helper(int num, int target) {
        if (num == 0) {
            return target == 0;
        }
        int pow = 10; 
        while (pow <= num * 10) { 
            int part = num % pow;
            if (helper(num / pow, target - part)) {
                return true;
            }
            pow *= 10; 
        }
        return false;
    }
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sqr = i * i;
            if (helper(sqr, i)) {
                ans += sqr;
            }
        }
        return ans;
    }
}