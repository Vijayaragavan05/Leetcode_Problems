class Solution {
    public int maxCount(int[] b, int n, int maxSum) {
        int count=0,sum=0;
        Set<Integer> list = new HashSet<>();
        for(int num:b){
            list.add(num);
        }
        for(int i=1;i<=n;i++){
            if (list.contains(i)) continue;   
            if (sum + i > maxSum) break;        
            sum += i;
            count++;
        }
        return count;
    }
}