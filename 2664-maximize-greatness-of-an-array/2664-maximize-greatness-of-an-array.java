class Solution {
    public int maximizeGreatness(int[] nums) {
        
        Arrays.sort(nums);
        int res = 0;
        //for(int i=0;i<nums.length;i++){
        for (int a : nums){
             if (a > nums[res]){
                res++;
             }  
        }
        return res;
    }
}