package Leetcode_DSA_Sheet_TUF;

//125. Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
// all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
import java.util.*;
public class Valid_Palindrome_String {
    public static Boolean ValidPalindrome(String s){
        s = s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>=97 && ch<=122) || (ch>=48 && ch<= 57)){
                s1.append(ch);
            }
        }
        int k = s1.length()-1;
        for(int i = 0;i<s1.length()/2;i++){
            if(s1.charAt(i)!= s1.charAt(k)){
                return false;
            }
            k--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(ValidPalindrome(s));
    }
}

