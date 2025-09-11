package Leetcode_DSA_Sheet_TUF;

public class IsSubsequence {
    public static boolean isSub(String a , String b){
        int i = 0;
        int j = 0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i) == b.charAt(j)){
                j++;
            }
            i++;
        }
        return b.length() == j;
    }
    public static void main(String[] args) {
        System.out.println(isSub("abcde","ace"));
        System.out.println(isSub("abcde","aec"));
    }
}
