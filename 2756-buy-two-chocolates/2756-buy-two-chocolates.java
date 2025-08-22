class Solution {
    public int buyChoco(int[] arr, int money) {
        Arrays.sort(arr);
        int sum=arr[0]+arr[1];
        if(sum>money)return money;
        return money-sum;
    }
}