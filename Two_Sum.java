package Leetcode_DSA_Sheet_TUF;


import java.util.ArrayList;
import java.util.Arrays;

    //1. Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]
    public class Two_Sum {
        public static int[] TwoSum(int[] arr,int k) {
            //Arrays.sort(arr);
//        int i = 0;
//        int j = 0;
//        int sum = 0;
//        //ArrayList<Integer> arr1 = new ArrayList<>();
//        int[] nums = new int[2];
//        nums[0] = -1;
//        nums[1] = -1;
//        while (j <= arr.length) {
//            if (sum == k) {
//                nums[0] = i;
//                nums[1] = j - 1;
//                return nums;
//            } else if (sum <= k) {
//                sum += arr[j];
//                j++;
//            } else {
//                sum -= arr[i];
//                i++;
//            }
//        }
//        return nums;
//    }
            Arrays.sort(arr);
            int n = arr.length;
            int nums[] = new int[2];
            int left = 0, right = n - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == k) {
                    nums[0] = left;
                    nums[1] = right;
                    return nums;
                } else if (sum < k) left++;
                else right--;
            }
            return nums;
        }
        public static void main(String[] args) {
            int [] arr = {3,2,3};
            int k = 6;
            System.out.println(Arrays.toString(TwoSum(arr,k)));
        }
    }

