package Leetcode_DSA_Sheet_TUF;


//704. Binary Search
//Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity
//Example 1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//Example 2
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
import java.util.Arrays;

public class Binary_Search {
    public static int BinarySearch(int [] arr,int k){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<k){
                start = mid+1;
            }
            else if(arr[mid]>k){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12}; //
        int k = 9;
        System.out.println(BinarySearch(arr,k));
    }
}

