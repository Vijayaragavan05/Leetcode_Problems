class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0,j=0;
        int min = Integer.MAX_VALUE;
        while(j<n){
            if(j-i+1==k){
               min = Math.min(min,nums[j]-nums[i]);
               i++; 
            }
            j++;
        }
        return min;
    }
}