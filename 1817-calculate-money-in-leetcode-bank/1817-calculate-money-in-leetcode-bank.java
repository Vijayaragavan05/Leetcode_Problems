class Solution {
    public int totalMoney(int n) {
        int sum=0,c=0,m=0;
        for(int i=1;i<=n;i++){
           if(c==7){
            m=i/7 +1;
            c=0;
           }
           else{
            m++;
           }
           sum+=m;
           c++;
        }
        return sum;
    }
}