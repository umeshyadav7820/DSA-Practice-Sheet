package Leetcode_DSA_Sheet_TUF;

//Floor in a Sorted Array
//Given a sorted array arr[] (with unique elements) and an integer k, find the index (0-based) of the largest element
// in arr[] that is less than or equal to k. This element is called the "floor" of k. If such an element does not exist, return -1.
//Examples
//Input: arr[] = [1, 2, 8, 10, 11, 12, 19], k = 0
//Output: -1
//Explanation: No element less than 0 is found. So output is -1.
//Input: arr[] = [1, 2, 8, 10, 11, 12, 19], k = 5
//Output: 1
//Explanation: Largest Number less than 5 is 2 , whose index is 1.
//Input: arr[] = [1, 2, 8], k = 1
//Output: 0
//Explanation: Largest Number less than or equal to  1 is 1 , whose index is 0.

public class Floor_Sorted_Array {
    public static int Floor(int [] arr,int k){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] == k){
                return i;
            }
            else if(arr[i] <k && k<arr[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 8, 10, 11, 12, 19}; //
        int k = 0;
        System.out.println(Floor(arr,k));
    }
}

