package Leetcode_DSA_Sheet_TUF;

public class Fibbonacci_Recursion {
    public static int fibbonacci(int n){
        if(n<=1){
            return n;
        }
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0;i<n;i++){
            System.out.print(fibbonacci(i)+" ");
        }
    }
}

