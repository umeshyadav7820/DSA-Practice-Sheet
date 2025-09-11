package Leetcode_DSA_Sheet_TUF;

public class Kadanes_Algorithim {
    public static int Longest_Subarray_Sum(int [] arr){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            sum +=arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(Longest_Subarray_Sum(arr));
    }
}
