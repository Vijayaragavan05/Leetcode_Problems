class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(temp>0){
            int dig = temp%10;
            if(dig!=0  && num%dig==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}