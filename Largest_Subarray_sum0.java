package Leetcode_DSA_Sheet_TUF;

//Largest subarray with 0 sum
//Difficulty: MediumAccuracy: 41.84%Submissions: 375K+Points: 4
//Given an array arr containing both positive and negative integers,
// the task is to compute the length of the largest subarray that has a sum of 0.
//Examples:
//Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
//Output: 5
//Explanation: The largest subarray with a sum of 0 is [-2, 2, -8, 1, 7].
//Input: arr[] = [2, 10, 4]
//Output: 0
//Explanation: There is no subarray with a sum of 0.
//Input: arr[] = [1, 0, -4, 3, 1, 0]
//Output: 5
//Explanation: The subarray is [0, -4, 3, 1, 0].
public class Largest_Subarray_sum0 {
    public static int subarray(int [] arr){
        int low = 0;
        int high = 0;
        int sum = 0;
        int maxi = 0;
        while(low<=high){
            sum += arr[high]; //15
            if(sum==0){
                maxi = Math.max(maxi,high-low);
                low++;
            }
            else{
                high++;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int [] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(subarray(arr));
    }
}

