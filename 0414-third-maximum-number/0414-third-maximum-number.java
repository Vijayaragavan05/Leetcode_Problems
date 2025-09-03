class Solution {
    public int thirdMax(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int n:nums){
        //     set.add(n);
        // }
        // List<Integer> list = new ArrayList<>(set);
        // Collections.sort(list);
        // if(list.size()<3){
        //     return list.get(list.size()-1);
        // }
        // return list.get(list.size()-3);

        // Integer a = null;
        // Integer b = null;
        // Integer c = null;
        // for(Integer n : nums){
        //     if(n.equals(a) || n.equals(b) || n.equals(c)) continue;
        //     if(a == null || n>a){
        //         c = b;
        //         b = a;
        //         a = n;
        //     }
        //     else if(b == null || n>b){
        //         c = b;
        //         b = n;
        //     }
        //     else if(c == null || n>c){
        //         c = n;
        //     }
        // }
        // return c == null ? a : c;


        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;
        for(int i : nums){
            if(i == a || i == b || i == c)continue;
            if(i > a){
                c = b;
                b = a;
                a = i;
            }else if(i > b){
                c = b;
                b = i;
            }else if(i > c){
                c = i;
            }
        }
        return (c == Long.MIN_VALUE)? (int)a : (int)c;
    }
}