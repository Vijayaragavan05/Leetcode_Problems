class Solution {
    public int reachNumber(int t) {
        int sum=0;
        int s=0;
        if(t==0)
        return 0;
        t=Math.abs(t);
        while(sum<t){
            sum+=s;
            s++;
        }
        while((sum-t)%2!=0){
            sum+=s;
            s++;
        }
        return s-1;
    }
}