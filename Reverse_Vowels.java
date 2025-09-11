package Leetcode_DSA_Sheet_TUF;

//345. Reverse Vowels of a String
//Given a string s, reverse only all the vowels in the string and return it.
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//Example 1:
//Input: s = "IceCreAm"
//Output: "AceCreIm"
//Explanation:
//The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
//Example 2:
//Input: s = "leetcode"
//Output: "leotcede"
import java.util.*;
public class Reverse_Vowels {
    public static String ReverseVowel(String s){
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        String s1 = s;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                arr1.add(i);
                arr.add(ch);
            }
        }
        return s1;
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(ReverseVowel(s));
    }
}

