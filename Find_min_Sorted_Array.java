package Leetcode_DSA_Sheet_TUF;

public class Find_min_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,6,7};
        int n = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<n){
                n = arr[i];
            }
        }
        System.out.println(n);
    }
}

