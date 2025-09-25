class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1,j=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]-j>k){
                count++;
                j=nums[i];
            }
        }
        return count;
    }
}