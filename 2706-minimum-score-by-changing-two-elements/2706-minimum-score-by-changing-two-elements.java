class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int d1 = nums[n-1]-nums[2];
        int d2 = nums[n-3]-nums[0];
        int d3 = nums[n-2]-nums[1];
        return Math.min(d1,Math.min(d2,d3));
    }
}