class Solution {
    public int getMinDistance(int[] nums, int t, int s) {
        
        int val=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
                val=Math.min(val,Math.abs(i-s));
            }
        }
        return val;
    }
}