package Leetcode_DSA_Sheet_TUF;

//Ceil The Floor
//Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].
//Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
//Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].
//Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.
//Examples:
//Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
//Output: 6, 8
//Explanation: Floor of 7 is 6 and ceil of 7 is 8.
//Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
//Output: 8, -1
//Explanation: Floor of 10 is 8 but ceil of 10 is not possible.
import java.util.Arrays;

public class Floor_and_Ceiling {
    public static int[] floor_Ceiling(int [] arr,int k){
        //Arrays.sort(arr);
//        int n = arr.length-1;
        int [] arr1 = new int[2];
//        for(int i = 1;i<arr.length;i++){
//            if(k>arr[i-1] && k<arr[i]){
//                arr1[0] = arr[i-1];
//                arr1[1] = arr[i];
//            }
//            else if (arr[n]<k){
//                arr1[0] = arr[n];
//                arr1[1] = -1;
//            }
//            else if(arr[0]>k){
//                arr1[0] = -1;
//                arr1[1] = arr[0];
//            }
//        }
//        return arr1;
        int[] ans = {-1,-1};
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k && arr[i]>floor){
                floor = arr[i]; // 6
                ans[0] = floor;//6
            }
            if(arr[i]>=k && arr[i]<ceil){
                ceil = arr[i];//8
                ans[1] = ceil;//8
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {5, 6, 8, 8, 6, 5, 5, 6};
        int x = 7;
        System.out.println(Arrays.toString(floor_Ceiling(arr,x)));
        //System.out.println(floor_Ceiling(arr,x));
    }
}

