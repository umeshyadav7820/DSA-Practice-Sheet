package Leetcode_DSA_Sheet_TUF;
import java.util.*;
public class next_permutation {
    public static int[] nextPermutation(int[] arr) {
        int idx1=-1;
        int idx2=-1;

        if(arr.length==1){
            arr[0]=arr[0];
        }

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                idx1=i;

            }
        }

        if(idx1==-1){
            Arrays.sort(arr);
        }
        else{
            int n=arr.length;
            for(int j=n-1; j>=0; j--){
                if(arr[j]>arr[idx1]){
                    idx2=j;
                    break;
                }
            }

            int temp=arr[idx1];
            arr[idx1]=arr[idx2];
            arr[idx2]=temp;

            Arrays.sort(arr,idx1+1,arr.length);
        }
        return arr;
    }
    public static void main(String[] args) {
        int []a = {1,2,5,4,3};
        System.out.println(Arrays.toString(nextPermutation(a)));
    }
}
