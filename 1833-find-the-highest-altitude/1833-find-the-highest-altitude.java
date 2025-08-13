class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,cur=0;
        for(int num:gain){
            cur+=num;
            max=Math.max(max,cur);
        }
        return max;
    }
}