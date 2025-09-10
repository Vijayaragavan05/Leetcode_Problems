class Solution {
    public double average(int[] s) {
      int min = s[0];
      int max = s[0];
      int sum =0;
      int n = s.length;
      for(int i=0;i<n;i++){
        min = Math.min(s[i],min);
        max = Math.max(s[i],max);
        sum+=s[i];
      }
      sum = sum-min-max;
      return (double)(sum)/(double)(n-2);
    }
}