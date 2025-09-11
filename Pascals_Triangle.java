package Leetcode_DSA_Sheet_TUF;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    //    public static long factorial(int n){
//        long fact = 1;
//        for(int i = n;i>0;i--){
//            fact *= i;
//        }
//        return fact;
////    }
//    public static long combination(int n, int r){
////        int comb = (int) (factorial(n)/(factorial(n-r)*factorial(r)));
////        return comb;
//        if (r > n) return 0; // Invalid case
//        if (r == 0 || r == n) return 1; // Base cases
//
//        long result = 1;
//        for (int i = 0; i < r; i++) {
//            result *= (n - i);
//            result /= (i + 1);
//        }
//        return result;
//    }
//    public static void pascal(int n){
//        List<List<Long>> combined = new ArrayList<>();
//        ArrayList<Long> brr = new ArrayList<>();
//        for(int i = 0;i<n;i++){
//            for(int j = 0;j<=i;j++){
//                brr.add(combination(i,j));
//            }
//            combined.add(new ArrayList<>(brr));
//            brr.clear();
//        }
//        for(int i=0;i<combined.size();i++){
//            System.out.println(combined.get(i));
//        }
//    }
//    public static void main(String[] args) {
////        System.out.println(pascal(20));
//        pascal(100);
//        //System.out.println(combination(21,1));
//    }
    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {  // n = 4,r = 3
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }
    public static void generate(int n){
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        //return ans;
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    public static void main(String[] args) {
        generate(20);

        //System.out.println(combination(21,1));
    }
}

