package Leetcode_DSA_Sheet_TUF;

import java.util.*;
public class Valid_Anagram {
    public static boolean anagram(String s,String t){
        if(s.length()!=t.length()) return false;
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)) return true;
        return false;

    }
    public static void main(String[] args) {
        String s = "cat";
        String t = "tac";
        System.out.println(anagram(s,t));
    }
}

