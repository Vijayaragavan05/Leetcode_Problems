class Solution {
    public long maxPoints(int[] t1, int[] t2, int k) {
        int n = t1.length;
        long tot=0;
        for(int x:t2){
            tot+=x;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=t1[i]-t2[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            tot+=arr[n-1-i];
        }
        for (int i=n-1-k;i>=0;i--) {
            if (arr[i] > 0) {
                tot += arr[i];
            } else {
                break;
            }
        }
        return tot;
    }
}