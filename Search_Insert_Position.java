package Leetcode_DSA_Sheet_TUF;

//35. Search Insert Position
//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//Input: nums = [1,3,5,6], target = 7
//Output: 4
// {4,5,6} target = 3;

public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            else if(nums[i]>target){
                return i;
            }
            else if(nums[nums.length-1]<target){
                return nums.length;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int t1 = 5;
        int [] arr1 = {1,3,5,6};
        int t2 = 2;
        int [] arr2 = {1,3,5,6};
        int t3 = 7;
        int [] arr3 = {4,5,6};
        int t4 = 3;
        System.out.println(searchInsert(arr,t1));
        System.out.println(searchInsert(arr1,t2));
        System.out.println(searchInsert(arr2,t3));
        System.out.println(searchInsert(arr3,t4));
    }
}

