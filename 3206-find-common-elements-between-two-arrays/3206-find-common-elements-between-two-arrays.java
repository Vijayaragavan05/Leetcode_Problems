class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int arr[] = new int[101];
        int arr1[] = new int[101];
        for(int num:nums1){
            arr[num]=1;
        }
        for(int num:nums2){
            arr1[num]=1;
        }
        int ans[] = new int[2];
        //int a=0,b=0;
        for(int num:nums1){
            ans[0]+=arr1[num];
        }
        for(int num:nums2){
            ans[1]+=arr[num];
        }
        return ans;
    }
}