package Dsa_Sheet;

import java.util.*;

public class Sliding_window_maximum {
    public static int[] Sliding_Wiindow(int [] nums,int k){
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                arr.add(nums[dq.peek()]);
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(Sliding_Wiindow(arr, k)));
    }
}


