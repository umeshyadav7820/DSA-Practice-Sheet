package Leetcode_DSA_Sheet_TUF;

import java.util.HashMap;
import java.util.Map;

//560. Subarray Sum Equals K
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Example 1:
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//Input: nums = [1,2,3], k = 3
//Output: 2
public class Subarray_Sum_Equals_k {
    public static int SubarraySum(int [] nums,int k){
//        int sum = arr[0];
//        int count = 0;
//        int start = 0;
//        int end = 0;
//        while(start<arr.length){
//            if(sum<k && end<arr.length){
//                if(end >0){
//                    sum+=arr[end];
//                }
//                end++;                        //{1,-1,0}
//            }
//            else if(sum == k){
//                count++;
//                sum-= arr[start];
//                start++;
//            }
//            else{
//                sum-= arr[start];
//                start++;
//            }
//        }
//        return count;
        int ans = 0;
        int prefix = 0;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);

        for (final int num : nums) {
            prefix += num;
            ans += count.getOrDefault(prefix - k, 0);
            count.merge(prefix, 1, Integer::sum);
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1};
        int l = 0;
        System.out.println(SubarraySum(arr,l));
        int [] brr = {1,1,1};
        int m = 2;
        System.out.println(SubarraySum(brr,m));
        int [] crr = {-1,-1,1};
        int n = 0;
        System.out.println(SubarraySum(crr,n));
        int [] drr = {1,2,3};
        int o = 3;
        System.out.println(SubarraySum(drr,o));
        int [] err = {1,-1,0};
        int p = 0;
        System.out.println(SubarraySum(err,p));
    }
}



