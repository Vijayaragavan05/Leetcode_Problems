package Leetcode;

public class ReverseString_541 {
    public static void main(String args[]){
        String s = "abcdefg";
        int k =2;
        System.out.println(rev(s,k));
    }
    public static String rev(String s,int k){
        char ch[] = s.toCharArray();
        int n = ch.length;
        int i=0;
        while(i<n){
            int j = Math.min(i+k-1,n);
            reverse(ch,i,j);
            i+=2*k;
        }
        return new String(ch);
    }
    public static void reverse (char[] arr,int i , int j){
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        i++;
        j--;
    }
}
