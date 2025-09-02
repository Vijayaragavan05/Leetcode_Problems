class Solution {
    public int minimumOperations(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int n:nums){
        //     if(n>0){
        //         set.add(n);
        //     }
        // }
        // return set.size();

        int ans[] = new int[101];
        int c = 0;
        for(int i:nums){
            if(ans[i]++==0) c++;
        }
        return c - (ans[0]==0?0:1);
    }
}