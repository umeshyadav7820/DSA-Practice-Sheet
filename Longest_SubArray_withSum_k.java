package Leetcode_DSA_Sheet_TUF;



//import java.util.*;
//
////Longest Sub-Array with Sum K
////Difficulty: MediumAccuracy: 24.64%Submissions: 511K+Points: 4
////Given an array arr[] containing integers and an integer k, your task is to find the length of the longest
//// subarray where the sum of its elements is equal to the given value k. It is guaranteed that a valid subarray exists.
////
////Examples:
////
////Input: arr[] = [10, 5, 2, 7, 1, 6, 9], k = 15
////Output: 4
////Explanation: The subarray [5, 2, 7, 1] has a sum of 15 and length 4.
////Input: arr[] = [-1, 2, -3], k = -2
////Output: 3
////Explanation: The subarray [-1, 2, -3] has a sum of -2 and length 3.
////Input: arr[] = [1, -1, 5, -2, 3], k = 3
////Output: 4
////Explanation: The subarray [1, -1, 5, -2] has a sum of 3 and a length 4.

import java.util.*;
public class Longest_SubArray_withSum_k {
    public static int LongestSubarray(int[]arr,int k){
//        int max_len=0;
//        int sum=0;
//        HashMap<Integer,Integer> map=new HashMap<>();
//
//        map.put(0,-1);
//
//        for(int i=0; i<arr.length; i++){           //10, 5, 2, 7, 1, 6, 9
//            sum+=arr[i];
//            int rem=sum-k;
//            if(map.containsKey(rem)){
//                int len=i-map.get(rem);
//                max_len=Math.max(max_len,len);
//            }
//
//            if(!(map.containsKey(sum))){
//                map.put(sum,i);
//            }
//
//        }
//        return max_len;

        // this method is not work for negative element
//        int start = 0;//
//        int end = 0;//
//        int sum = 0;//
//        int count = 0;//
//        int maxcount = 0;//
//        while(end<arr.length){
//            if(sum<k){
//                sum += arr[end];
//                end++;
//            }
//            else if(sum == k){
//                count = end - start;
//                maxcount = Math.max(count,maxcount);
//                sum -= arr[start];
//                start++;
//            }
//            else{
//                sum -= arr[start];
//                start++;
//            }
//        }
//        return maxcount;

        // use presum method

//        int sum = 0;
//        int start = 0;
//        int count = 0;
//        int maxcount = 0;
//        for(int i = 0;i<arr.length;i++){
//            sum += arr[i];
//            if(sum == k){
//                count = i-start+1;
//                maxcount = Math.max(count,maxcount);
//                sum = sum-arr[start];
//                start++;
//            }
//            else if(sum > k){
//                sum = sum-arr[start];
//                start++;
//            }
//        }
//        return maxcount;
        HashMap<Integer,Integer> has = new HashMap<>();
        has.put(0,-1);
        int sum = 0;
        int max_Length = 0;
        for(int i = 0;i<arr.length;i++){
            sum+= arr[i];
            int rem = sum-k;
            if(has.containsKey(rem)){
                int c = i-has.get(rem);
                max_Length = Math.max(c,max_Length);
            }
            if(!(has.containsKey(sum))){
                has.put(sum,i);
            }
        }
        return max_Length;
    }
    public static void main(String[] args) {
        int [] arr = {1, -1, 5, -2};
        int k = 3;
        System.out.println(LongestSubarray(arr,k));
    }
}



