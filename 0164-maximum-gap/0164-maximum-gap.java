class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        int c= Integer.MIN_VALUE;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int diff = nums[i+1]-nums[i];
            if(c<diff){
                c=diff;
            }
        }
        return c; 
    }
}