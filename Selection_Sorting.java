package Leetcode_DSA_Sheet_TUF;

import java.util.Arrays;

public class Selection_Sorting {
    public static int[] Sorting(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i ; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {6,3,6,8,9,2};
        System.out.println(Arrays.toString(Sorting(arr)));
    }
}

