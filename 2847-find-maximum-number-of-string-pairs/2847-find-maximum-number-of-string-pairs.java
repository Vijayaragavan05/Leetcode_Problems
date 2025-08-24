class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        int n=words.length;
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++){
        //         if(words[i].charAt(0)==words[j].charAt(1) && words[i].charAt(1)==words[j].charAt(0)){
        //             count++;
        //         }
        //     }
        // }

        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            String str = words[i];
            StringBuilder sb = new StringBuilder(str);
            String rev = sb.reverse().toString();
            if(!set.contains(rev)){
                set.add(str);
            }
            else{
                count++;
            }
        }
        return count;
    }
}