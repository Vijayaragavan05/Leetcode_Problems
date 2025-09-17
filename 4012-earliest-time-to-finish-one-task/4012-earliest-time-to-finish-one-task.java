class Solution {
    public int earliestTime(int[][] t) {
        int n = t.length;
        int max= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(t[i][0] + t[i][1]<max){
                max = t[i][0] + t[i][1];
            }
        }
        return max;
    }
}