class Solution {
    public int[] findErrorNums(int[] nums) {
    //    int dup=0,mis=0;
    //    for(int i=1;i<=nums.length;i++){
    //         int c=0;
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[j]==i)c++;
    //         }
    //         if(c==2)dup=i;
    //         else if(c==0) mis=i;
    //    }
    //    return new int[]{dup,mis};
        int arr[] = new int[nums.length+1];
        for(int n:nums){
            arr[n]++;
        }
        int ans[] = new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                ans[0]=i;
            }
            else if(arr[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}