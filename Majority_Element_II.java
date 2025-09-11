package Leetcode_DSA_Sheet_TUF;

//229. Majority Element II
//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//Example 1:
//Input: nums = [3,2,3]
//Output: [3]
//Example 2:
//Input: nums = [1]
//Output: [1]
//Example 3:
//Input: nums = [1,2]
//Output: [1,2]
import java.util.*;

public class Majority_Element_II {
    public static List<Integer> majorityElement(int[] arr) {

        List<Integer> ans = new ArrayList<>();
//        int n = arr.length;
//        double k = n/3;
//        for(int i = 0;i<n;i++){
//            int count = 0;
//            for(int j = 0;j<n;j++){
//                if(arr[i] == arr[j] ){
//                        count++;
//                }
//            }
//            if(count>k){
//                ans.add(arr[i]);
//            }
//        }
//        HashSet<Integer> has1 = new HashSet<>(ans);
//        List<Integer> ans1 = new ArrayList<>(has1);
//        return ans1;


//        int n = arr.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        List<Integer> res = new ArrayList<Integer>();
//        for(int i=0;i<n;i++){
//            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//            }
//        for(Map.Entry<Integer, Integer> e:map.entrySet()){
//            if(e.getValue() > n/3)
//                res.add(e.getKey());
//        }
//        return res;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> has: map.entrySet()){
            if(has.getValue()>n/3){
                ans.add(has.getKey());
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(majorityElement(arr));
    }
}



