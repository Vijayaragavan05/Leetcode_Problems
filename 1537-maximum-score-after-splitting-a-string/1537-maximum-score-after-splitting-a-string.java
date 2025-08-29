class Solution {
    public int maxScore(String s) {
        int total = 0;
        int zero =0;
        int ones =0;
        int score =0;
        for(char ch:s.toCharArray()){
            if(ch=='1') total++;
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')zero++;
            else ones++;
            int curr = zero +(total - ones);
            score =Math.max(score,curr);
        }
        return score;
    }
}