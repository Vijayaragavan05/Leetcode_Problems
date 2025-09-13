class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int n = nums.length;
        for(int j=0;j<k;j++){
            int min=0;
            for(int i=0;i<n;i++){
                if(nums[i]<nums[min]){
                    min=i;
                }
            }
            nums[min]*=m;
        }
        return nums;
    }
}