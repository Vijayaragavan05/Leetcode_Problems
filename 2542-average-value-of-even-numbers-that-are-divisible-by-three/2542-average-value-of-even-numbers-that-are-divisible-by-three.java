class Solution {
    public int averageValue(int[] nums) {
        int c=0,sum=0;
        for(int n : nums){
            if(n%6==0){
                sum+=n;
                c++;
            }
        }
        return c==0?0:sum/c;
    }
}