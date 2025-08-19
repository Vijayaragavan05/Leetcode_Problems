class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int num:nums){
        //     if(set.contains(num)){
        //         return num;
        //     }
        //     set.add(num);
        // }
        // return -1;
        
        boolean x[] = new boolean[nums.length];
        for(int num : nums){
            if(!x[num]){
                x[num] = true;
            }else{
                return num;
            }
        }
        return -1;
    }
}