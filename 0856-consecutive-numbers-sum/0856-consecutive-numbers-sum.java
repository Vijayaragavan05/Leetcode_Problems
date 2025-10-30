class Solution {
    public int consecutiveNumbersSum(int n) {
        int c=0;
        for(int i=1;i*i<=n;i++){
           if(n%i>0)continue;
           int j=n/i;
           if(i % 2 == 1) c++;
           if(j != i && j % 2 == 1) c++;
        }
        return c;
    }
}