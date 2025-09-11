package Leetcode_DSA_Sheet_TUF;

//15. 3Sum
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.
//Example 2:
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.
//Example 3:
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.
import java.util.*;
public class Three_Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans1 = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumSorted(i + 1, nums.length - 1, nums, 0 - nums[i]);
            }
        }
        return ans1;
    }
    public static void twoSumSorted(int i, int j, int[] nums, int target){
        List<List<Integer>> ans1 = new ArrayList<>();
        int a1 = nums[i-1];
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(a1);list.add(nums[i]);list.add(nums[j]);
                ans1.add(list);
                // check duplicates
                while(i<j && nums[i] == nums[i+1])i++;
                while(i<j &&nums[j] == nums[j-1])j--;
                i++;j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}























