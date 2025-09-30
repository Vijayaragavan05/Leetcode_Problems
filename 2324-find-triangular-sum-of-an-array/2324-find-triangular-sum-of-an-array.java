class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        return fact(nums,n);
    }
    public int fact(int a[],int s){
        if(s==0) return a[0];
        for(int i=0;i<s-1;i++){
            a[i]=(a[i]+a[i+1])%10;
        }
        return fact(a,s-1);
    }
}