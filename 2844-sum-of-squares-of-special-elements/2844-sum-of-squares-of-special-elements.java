class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(nums[i-1]);
            }
        }
        int sum=0;
        for(int num:list){
            sum+=num*num;
        }
        return sum;
    }
}