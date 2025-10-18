class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
         int c=0;
         int pre = Integer.MIN_VALUE;
         for(int n:nums){
            int cur = Math.min(Math.max(n-k,pre+1),n+k);
            if(cur>pre){
                c++;
                pre = cur;
            }
         }
        return c;
    }
}