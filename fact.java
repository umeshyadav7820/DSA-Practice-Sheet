package Leetcode_DSA_Sheet_TUF;

public class fact {
    public static int factorial(int n){
        if(n == 0|| n == 1) return 1;
        return n*factorial(n-1);
    }
    public static void print_num(int n){
        if(n<=0) return;
        print_num(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        print_num(n);

    }
}

