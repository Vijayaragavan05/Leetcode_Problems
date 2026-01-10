class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list= new ArrayList<>();
        for(int num:nums){
            if(set.contains(num)){
                list.remove(Integer.valueOf(num));
            }
            else{
                set.add(num);
                list.add(num);
            }
        }
        int ans[] = new int[list.size()];
        int i=0;
        for(int n:list){
            ans[i++]=n;
        }
        return ans;
    }
}