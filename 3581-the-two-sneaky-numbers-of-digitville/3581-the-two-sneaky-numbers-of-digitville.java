class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            if(set.contains(n)) list.add(n);
            else set.add(n);
        }
        return new int[]{list.get(0),list.get(1)};
    }
}