package Leetcode_DSA_Sheet_TUF;

import java.util.Arrays;
public class Bubble_Sort {
    public static int[] Sorting(int [] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {6,3,6,8,9,2};
        System.out.println(Arrays.toString(Sorting(arr)));
    }
}

