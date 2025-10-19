class Solution {
    public int partitionDisjoint(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            arr1[i]=max;
        }
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>0;i--){
            min=Math.min(min,nums[i]);
            arr2[i]=min;
        }
        for(int i=1;i<nums.length;i++){
            if(arr1[i-1]<=arr2[i]) return i;
        }
        return nums.length;
    }
}