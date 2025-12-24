class Solution {
    public int minimumBoxes(int[] app, int[] cap) {
        int tot = 0;
        for(int a:app){
            tot+=a;
        }
        Arrays.sort(cap);
        int c=0;
        for(int i=cap.length-1;i>=0;i--){
            tot-=cap[i];
            c++;
            if(tot<=0) return c;
        }
        return c;
    }
}