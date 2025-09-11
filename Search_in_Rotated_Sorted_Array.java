package Leetcode_DSA_Sheet_TUF;

import java.util.*;

//33. Search in Rotated Sorted Array
//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown
// pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example,
// [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target,
// return the index of target if it is in nums, or -1 if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//Input: nums = [1], target = 0
//Output: -1
public class Search_in_Rotated_Sorted_Array {
    public static int search(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = 1;
        while(end<nums.length){
            if(nums[start] == nums[end]){
                start = start+2;
                end = start+1;
            }
            else{
                return nums[start];
            }
        }
        return -1;
    }
    public static int findPeakElement(int[] nums) {
        int peak = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>nums[peak]){
                peak = i;
            }
        }
        return peak;
    }
    public static void main(String[] args) {
//        int [] arr = {1};
//        int k = 0;
//        System.out.println(search(arr,k));
//        int [] arr1 = {1,1,2,3,3,4,4,8,8};
//        System.out.println(singleNonDuplicate(arr1));
        int [] arr2 = {1,2,3,1};
        System.out.println(findPeakElement(arr2));
        int a = 25;
        System.out.println((int)Math.pow(a,0.5));
    }
}







