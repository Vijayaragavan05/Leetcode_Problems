class Solution {
    public int bestClosingTime(String c) {
        int p=0,bp=0,ans=0;
        int i=0;
        for(char ch : c.toCharArray()){
            if(ch=='Y'){
                p--;
            }
            else p++;
            i++;
            if(p<bp){
                bp=p;
                ans=i;
            }
        }
        return ans;
    }
}