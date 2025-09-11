package Leetcode_DSA_Sheet_TUF;

//Number of occurrence
//Difficulty: EasyAccuracy: 59.34%Submissions: 292K+Points: 2
//Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[].
//Examples :
//Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
//Output: 4
//Explanation: target = 2 occurs 4 times in the given array so the output is 4.
//Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
//Output: 0
//Explanation: target = 4 is not present in the given array so the output is 0.
//Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
//Output: 3
//Explanation: target = 12 occurs 3 times in the given array so the output is 3.
import java.util.HashMap;
public class NoOfOccurance {
    public static int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> has = new HashMap<>();
        for(int i : arr){
            has.put(i,has.getOrDefault(i,0)+1);
        }
        if(has.containsKey(target)){
            return has.get(target);
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 2, 2, 3};
        int k = 2;
        System.out.println(countFreq(arr,k));
    }
}

