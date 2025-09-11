package Leetcode_DSA_Sheet_TUF;


public class SearchInA2dMatrix {
    public static boolean searchInRow(int[][]matrix,int target,int mid,int n){
        int st = 0;
        int end = n-1;
        while(st<=end){
            int m = st+(end-st)/2;
            if(target<matrix[mid][m]){
                end = m-1;
            }
            else if(target>matrix[mid][m]){
                st = m+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int st = 0;
        int end = m-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target>=matrix[mid][0] && target <= matrix[mid][n-1]){
                return searchInRow(matrix,target,mid,n);
            }
            else if(target>=matrix[mid][n-1]){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        int target = 13;
        System.out.println(searchMatrix(matrix,target));
    }


}
