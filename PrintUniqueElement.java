package Leetcode_DSA_Sheet_TUF;

import java.util.*;
public class PrintUniqueElement {
    public static int unique(String s) {
        char [] feq = new char[26];
        char [] arr = s.toCharArray();
        for(char i : arr){
            feq[i-'a']++;
        }
        for(int i = 0;i<feq.length;i++){
            if(feq[arr[i]-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s  = "leetcode";
        System.out.println(unique(s));

    }
}

