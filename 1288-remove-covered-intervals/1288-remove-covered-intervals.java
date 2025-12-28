class Solution {
    public int removeCoveredIntervals(int[][] inter) {
        int ans=0,n=inter.length;
        for(int i=0;i<n;i++){
            int a = inter[i][0];
            int b = inter[i][1];
            for(int j=0;j<n;j++){
                int c = inter[j][0];
                int d = inter[j][1];

                if(i!=j && c<=a && b<=d){
                    ans++;
                    break;
                }
            }
        }
        return n-ans;
    }
}