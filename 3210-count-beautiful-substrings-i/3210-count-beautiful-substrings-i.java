class Solution {
    public int beautifulSubstrings(String s, int k) {
       char[] arr = s.toCharArray();
        int n = arr.length, ans = 0;
        for(int i = 0; i < n; i++) {
            int count1 = 0, count2 = 0;
            for(int j = i; j < n; j++) {
                switch(arr[j]) {
                    case 'a','e','i','o','u': count1++;
                    break;
                    default: count2++;
                }
                if(count1 == count2 && count1 * count2 % k == 0) ans++;
            }
        }
        return ans;
    }
}
