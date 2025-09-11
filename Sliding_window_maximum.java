package Leetcode_DSA_Sheet_TUF;

import java.util.*;

public class Sliding_window_maximum {
    public static int[] Sliding_Wiindow(int [] nums,int k){
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); // stores indices
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                arr.add(nums[dq.peek()]);
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {7,2,4};
        int k = 2;
        System.out.println(Arrays.toString(Sliding_Wiindow(arr, k)));
    }
}

//        int n = (nums.length-2);
//        int arr[] = new int[n];
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int[] subarray = Arrays.copyOfRange(nums, i, i + k);
//            int max = Arrays.stream(subarray).max().orElse(Integer.MIN_VALUE);
//            if (j<n){
//                arr[j] = max;
//                j++;
//            }
//        }
//        return arr;
//        if(nums == null || nums.length<k){
//            throw new IllegalArgumentException("Array null.");
//        }
//        int maxSum = 0;
//        int windowSum = 0;
//        int start = 0;
//        for(int end = 0;end<nums.length;end++){
//            windowSum += nums[end];
//            if(end>=k-1){
//                maxSum = Math.max(windowSum,maxSum);
//                windowSum -= nums[start];
//                start++;
//            }
//        }
//        return maxSum;
//        int maxSum = Integer.MIN_VALUE;
//        int windowSum = 0;
//        int start = 0;
//        if(k == 1){
//            return nums;
//        }
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int end = 0;end<nums.length;end++){
//            windowSum = nums[end];
//            maxSum = Math.max(windowSum,maxSum);
//            if(end>=k-1){
//                arr.add(maxSum);
//                start++;
//            }
//        }
//        int arr2[] = new int[arr.size()];
//        for(int i = 0;i<arr.size();i++){
//            arr2[i] = arr.get(i);
//        }
//        return arr2;
