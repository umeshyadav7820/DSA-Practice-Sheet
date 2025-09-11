package Leetcode_DSA_Sheet_TUF;

//11. Container With Most Water
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.
//Example 1:
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//Example 2:
//Input: height = [1,1]
//Output: 1
public class leetcode_11 {
    public static int maxArea(int[] arr) {
//        int area = 0;
        int maxSum = 0;
//        int start = 0;
//        int end = 1;
        int n = arr.length;
//        while(start<n) {
//            if(end<n){
//                int ht = Math.min(arr[start],arr[end]);
//                int wide = end-start;
//                area = ht*wide;
//                end++;
//                maxSum = Math.max(area,maxSum);
//            }
//            else if(end == n){
//                start++;
//                end = start+1;
//            }
//
//        }

        int lp = 0;
        int hp = n-1;
        int area = 0;
        while(lp<hp){
            int ht = Math.min(arr[lp],arr[hp]);
            int wide = hp-lp;
            area = ht*wide;
            maxSum = Math.max(area,maxSum);
            if(arr[lp]<arr[hp]) lp++;
            else hp--;
        }
        return maxSum;
    }
    public static void main(String []args) {
        int[] arr = {8,7,2,1};
        System.out.println(maxArea(arr));
    }
}

