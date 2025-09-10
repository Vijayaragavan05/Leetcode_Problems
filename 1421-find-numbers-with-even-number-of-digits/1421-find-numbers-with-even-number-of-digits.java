class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int n:nums){
            String s = String.valueOf(n);
            if(s.length()%2==0){
                c++;
            }
        }
        return c;
    }
}