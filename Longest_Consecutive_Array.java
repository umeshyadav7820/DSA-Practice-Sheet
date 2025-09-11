package Leetcode_DSA_Sheet_TUF;


//28. Longest Consecutive Sequence
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Example 1:
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.
//Example 2:
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
import java.util.*;
public class Longest_Consecutive_Array {
    public static int longestConsecutive(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        Arrays.sort(arr);
        int count = 1;
        int cnt = 1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] == 1){
                count++;
                cnt = Math.max(cnt,count);
            }
            else if(arr[i+1]-arr[i] > 1){
                count = 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int [] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}


