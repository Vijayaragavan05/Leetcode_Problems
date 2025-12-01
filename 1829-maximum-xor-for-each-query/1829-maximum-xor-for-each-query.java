class Solution {
    public int[] getMaximumXor(int[] nums, int m) {
        int n = nums.length;
        int x = nums[0];
        int max=(1<<m)-1;
        for(int i=1;i<n;i++){
            x^=nums[i];
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=x^max;
            x^=nums[n-1-i];
        }
        return ans;
    }
}