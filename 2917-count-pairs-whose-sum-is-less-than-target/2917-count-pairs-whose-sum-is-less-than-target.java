class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int arr[] = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            arr[i]=nums.get(i);
        }
        int count=0,n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]+arr[i]<target){
                    count++;
                }
            }
        }
        return count;
    }
}