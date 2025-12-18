class Solution {
    public int countArrays(int[] og, int[][] b) {
        int n = og.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= og[i]+og[0];
        }
        int l = Integer.MIN_VALUE;
        int h = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int u = b[i][0];
            int v = b[i][1];

            l = Math.max(l,u-arr[i]);
            h = Math.min(h,v-arr[i]);
        }
        if(l>h) return 0;
        return h-l+1;
    }
}