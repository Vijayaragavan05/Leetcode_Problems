class Solution {
    public long minCost(String s, int[] cost) {
        long tot =0;
        for(int c:cost){
            tot+=c;
        }
        long arr[] = new long[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=cost[i];
        }
        long min = Long.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                min = Math.min(min,tot-arr[i]);
            }
        }
        return min;
    }
}
