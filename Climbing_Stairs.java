package Leetcode_DSA_Sheet_TUF;

import java.util.Arrays;
import java.util.Scanner;

// 70. Climbing Stairs
//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Example 1:
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
public class Climbing_Stairs {
    public static int ClimbingStairs(int n){
        if(n == 0) return 0;
        int [] fib = new int[n+2];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2;i<fib.length;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }

        return fib[fib.length-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        //System.out.println(Arrays.toString(ClimbingStairs(n)));
        System.out.println(ClimbingStairs(n));
    }
}

