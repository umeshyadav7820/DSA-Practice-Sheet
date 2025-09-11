package Leetcode_DSA_Sheet_TUF;

import java.util.Arrays;

//875. Koko Eating Bananas
//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
//Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//Return the minimum integer k such that she can eat all the bananas within h hours.
//Example 1:
//Input: piles = [3,6,7,11], h = 8
//Output: 4
//Example 2:
//Input: piles = [30,11,23,4,20], h = 5
//Output: 30
//Example 3:
//Input: piles = [30,11,23,4,20], h = 6
//Output: 23
public class Koko_Eating_Bananas {
    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }
    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }
    public static int minEatingSpeed(int[] arr, int h) {
        int start = 1;int end = findMax(arr);
        while(start<=end){
            int mid = (start+end)/2;
            int max_count = calculateTotalHours(arr,mid);
            if(max_count<=h){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(arr,h));
    }
}
//import java.util.Arrays;
//public class Koko_Eating_Bananas {
//    public static int minEatingSpeed(int[] arr, long h) { // Changed int to long
//        Arrays.sort(arr);
//        int start = 1;int end = (int) 1e9;
//        while(start<=end){
//            int mid = (start+end)/2;
//            int count = 0;
//            long max_count = 0; // Changed int to long
//            int i = 0;
//            while(i<arr.length){
//                count = arr[i]/mid;
//                if(arr[i]%mid>=0){
//                    count +=1;
//                }
//                max_count = max_count+count; // Now this operation won't overflow
//                i++;
//                count = 0;
//            }
//            i = 0;
//            if(max_count == h){
//                return mid;
//            }else if(max_count<h){
//                end = mid;
//            }
//            else if(max_count>h){
//                start = mid+1;
//            }
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        int [] arr = {3,6,7,11};
//        long h = 8; // Added L to specify long literal
//        System.out.println(minEatingSpeed(arr,h));
//    }
//}

// Approach by tuf gaming
//import java.util.*;

//public class Koko_Eating_Bananas {
//    public static int findMax(int[] v) {
//        int maxi = Integer.MIN_VALUE;;
//        int n = v.length;
//        //find the maximum:
//        for (int i = 0; i < n; i++) {
//            maxi = Math.max(maxi, v[i]);
//        }
//        return maxi;
//    }
//
//    public static int calculateTotalHours(int[] v, int hourly) {
//        int totalH = 0;
//        int n = v.length;
//        //find total hours:
//        for (int i = 0; i < n; i++) {
//            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
//        }
//        return totalH;
//    }
//
//    public static int minimumRateToEatBananas(int[] v, int h) {
//        int low = 1, high = findMax(v);
//
//        //apply binary search:
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            int totalH = calculateTotalHours(v, mid);
//            if (totalH <= h) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return low;
//    }
//
//    public static void main(String[] args) {
//        int[] v = {3,6,7,11};
//        int h = 8;
//        int ans = minimumRateToEatBananas(v, h);
//        System.out.println(ans);
//    }
//}
