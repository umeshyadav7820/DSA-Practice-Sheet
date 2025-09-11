package Leetcode_DSA_Sheet_TUF;

public class Combination {

    public static long combination(int n,int r){
        if (r > n) return 0; // Invalid case
        if (r == 0 || r == n) return 1; // Base cases

        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(combination(21,1));
    }
}

