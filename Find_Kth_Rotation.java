package Leetcode_DSA_Sheet_TUF;

import java.util.*;

//Find Kth Rotation
//Difficulty: EasyAccuracy: 23.16%Submissions: 257K+Points: 2
//Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
//Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
//After 1st Rotation : [9, 2, 4, 6]
//After 2nd Rotation : [6, 9, 2, 4]
//Examples:
//Input: arr = [5, 1, 2, 3, 4]
//Output: 1
//Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.
//Input: arr = [1, 2, 3, 4, 5]
//Output: 0
//Explanation: The given array is not rotated.
public class Find_Kth_Rotation {
    public static int findKRotation(List<Integer> arr) {
        List<Integer> arr1 = new ArrayList<>(arr);
        Collections.sort(arr);
        int k = arr.get(0);
        for(int i = 0;i<arr.size();i++){
            if(arr1.get(i) == k){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list ");
        int n = sc.nextInt();
        System.out.println("Enter element of an List ");
        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(findKRotation(arr));
    }
}

