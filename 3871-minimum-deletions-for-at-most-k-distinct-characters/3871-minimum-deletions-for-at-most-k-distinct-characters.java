class Solution {
    public int minDeletion(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size()<=k)return 0;
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int count=0,n=list.size(),i=0;
        while(n>k){
            count+=list.get(i);
            i++;
            n--;
        }
        return count;
    }
}