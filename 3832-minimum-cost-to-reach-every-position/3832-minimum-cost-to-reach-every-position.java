class Solution {
    public int[] minCosts(int[] cost) {
        int n = Integer.MAX_VALUE;
        for(int i=0;i<cost.length;i++){
            if(n>cost[i]) n=cost[i];
             cost[i]=n;
        }
       return cost;
    }
}