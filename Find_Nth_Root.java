package Leetcode_DSA_Sheet_TUF;

import java.util.Scanner;

public class Find_Nth_Root {
    public static int nth_root(int n,int m){
        int start = 1;
        int end = m;
        int mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            if(Math.pow(mid,n) == m){
                return mid;
            }
            else if(m<Math.pow(mid,n)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
        int n = 2;int m = 9;
        System.out.println(nth_root(n,m));
    }
}

