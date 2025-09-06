class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0,sum2=0;
        // int arr1[] = new int[n];
        // int arr2[] = new int[n];
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
        }
        return sum1-sum2;
    }
}