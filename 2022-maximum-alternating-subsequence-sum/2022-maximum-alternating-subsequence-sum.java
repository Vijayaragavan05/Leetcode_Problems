class Solution {
    public long maxAlternatingSum(int[] nums) {
        long i=0,j=0;
        for(int n:nums){
            j=Math.max(j,i+n);
            i=j-n;
        }
        return j;
    }
}