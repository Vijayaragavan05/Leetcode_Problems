class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1;
        int t=n;
        while(n>0){
            int dig = n%10;
            sum +=dig;
            prod *= dig;
            n/=10;
        }
        int val = sum+prod;
        if(t%val==0) return true;
        return false;
    }
}