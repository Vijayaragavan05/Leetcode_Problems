class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        // int i = 0,j=0,max=0;
        // while(i<nums1.length && j<nums2.length){
        //     if(i<=j && nums1[i]<=nums2[j]){
        //         max=Math.max(max,j-i);
        //         j++;
        //     }
        //     else{
        //         i++;
        //         if(i>j){
        //             j=i;
        //         }
        //     }
        // }
        // return max;

        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0;
        
        while(i < n1 && j < n2){

            if(i < n1 && nums1[i] > nums2[j]) i++;
            j++;
        }
        
        return Math.max(0, j - i - 1);
    }
}