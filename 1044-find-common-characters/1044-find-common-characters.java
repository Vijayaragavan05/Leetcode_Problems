class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        for(char c='a';c<='z';c++){
            int min=Integer.MAX_VALUE;
            for(String s :words){
                int count=0;
                for(char ch:s.toCharArray()){
                    if(ch==c){
                        count++;
                    }
                }
                min=Math.min(min,count);
                if(min==0)break;
            }
            for(int i=0;i<min;i++){
                list.add(String.valueOf(c));
            }
        }
        return list;
    }
}