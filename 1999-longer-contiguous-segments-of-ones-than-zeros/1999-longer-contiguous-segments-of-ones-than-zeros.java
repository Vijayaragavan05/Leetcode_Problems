class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0,zero=0;
        int max1=0,max2=0;
        if(s.length()==1 && s.equals("1"))return true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='0'){
                zero++;
                max2=Math.max(max2,zero);
                one=0;
            }
            else{
                one++;
                max1=Math.max(max1,one);
                zero=0;
            }
        }
        return max1>max2;
    }
}