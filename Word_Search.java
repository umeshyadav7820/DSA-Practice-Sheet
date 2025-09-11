package Leetcode_DSA_Sheet_TUF;

import java.util.HashMap;
import java.util.Map;

//290. Word Pattern
//Given a pattern and a string s, find if s follows the same pattern.
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
//Each letter in pattern maps to exactly one unique word in s.
//Each unique word in s maps to exactly one letter in pattern.
//No two letters map to the same word, and no two words map to the same letter.
//Example 1:
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Explanation:
//The bijection can be established as:
//'a' maps to "dog".
//'b' maps to "cat".
//Example 2
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false
public class Word_Search {
    public static boolean wordSearch(String pattern,String s){
        String [] words = s.split(" ");
        // Check if pattern length matches the number of words
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];
//            if (!patternToWord.getOrDefault(patternChar, word).equals(word) ||
//                    wordToPattern.getOrDefault(word, patternChar) != patternChar) {
//                return false;
//            }
//            patternToWord.put(patternChar, word);
//            wordToPattern.put(word, patternChar);
            if (patternToWord.containsKey(patternChar)) {
                if (!patternToWord.get(patternChar).equals(word)) {
                    return true;
                }
            } else {
                patternToWord.put(patternChar, word);
            }

            if (wordToPattern.containsKey(word)) {
                if (wordToPattern.get(word) != patternChar) {
                    return true;
                }
            } else {
                wordToPattern.put(word, patternChar);
            }
        }
        return false;



    }
    public static void main(String[] args) {
        System.out.println(wordSearch("abbc","dog cat cat dog"));
    }
}
