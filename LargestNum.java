//package edu.wku.largestnum;

public class LargestNum {
    public static int findLargestNum(int[] nums){
        int a = nums[0];
        int len = nums.length;
        for (var i : nums) {
            a = Integer.max(i, a);
        }
        return a;
    }
}