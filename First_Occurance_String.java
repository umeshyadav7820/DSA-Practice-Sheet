package Leetcode_DSA_Sheet_TUF;

public class First_Occurance_String {
    public static int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
        for(int i = 0;i<=a-b;i++) {
            String s = haystack.substring(i,b+i);
            if(s.equals(needle)){
                return i;
            }
        }
        //return haystack.indexOf(needle);
        return -1;

    }
    public static void main(String[] args) {
        String a = "leetcode";
        String b = "leeto";
        System.out.println(strStr(a,b));
        //System.out.println(b.charAt(4));
    }
}

