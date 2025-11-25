class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        int rem = 1%k;
        //StringBuilder sb = new StringBuilder("1");
        int sum=1;
        while(rem!=0){
            //sb.append('1');
            sum+=1;
            rem=(rem*10+1)%k;
        }
        // String s = sb.toString();
        // return Integer.parseInt(s);
        return sum;
    }
}