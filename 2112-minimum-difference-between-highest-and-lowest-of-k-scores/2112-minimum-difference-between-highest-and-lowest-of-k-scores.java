class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int val = Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            val = Math.min(val,nums[i+k-1]-nums[i]);
        }
        return val;
    }
}