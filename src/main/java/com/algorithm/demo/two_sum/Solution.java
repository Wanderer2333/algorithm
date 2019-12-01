package com.algorithm.demo.two_sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (null == nums && nums.length < 1 ) {
            throw new IllegalArgumentException("No two sum solution");
        }
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
