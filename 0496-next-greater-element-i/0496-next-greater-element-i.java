class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length,n1=nums2.length;
        int ans[] = new int[n];
        
        for(int i=0;i<n;i++){
            int num=nums1[i];
            int ind=-1;
            for(int j=0;j<n1;j++){
                if(nums2[j]==num){
                    ind=j;
                    break;
                }
            }
            ans[i]=-1;
            for(int j=ind+1;j<n1;j++){
                if (nums2[j] > num) {
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}