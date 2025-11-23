class Solution {
    public int[] recoverOrder(int[] o, int[] f) {
        int n = f.length;
        int arr[] = new int[n];
        List<Integer> li = new ArrayList<>();
        for(int num:f){
            li.add(num);
        }
        int i=0;
        for(int num:o){
            if(li.contains(num)){
                arr[i++]=num;
            }
        }
        return arr;
    }
}