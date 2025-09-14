class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        
        for(int n:nums){
            int temp = n;
            String rem="";
            while(temp!=0){
                int dig = temp%10;
                rem += dig;
                temp/=10;
            }
            int num = Integer.valueOf(rem);
            if(!set.contains(num)){
                set.add(num);
            }
        }
        
        return set.size();
    }
}