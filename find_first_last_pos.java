package Leetcode_DSA_Sheet_TUF;

import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity
//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//Input: nums = [], target = 0
//Output: [-1,-1]
public class find_first_last_pos {
    public static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        int k = nums.length-1;
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                a = Math.min(a,i);
                ans[0] = a;
            }
            if(nums[k]==target){
                b = Math.max(b,k);
                ans[1] = b;
            }
            k--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2};
        int x = 2;
        System.out.println(Arrays.toString(searchRange(arr,x)));
    }
}

