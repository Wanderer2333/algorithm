package com.algorithm.demo.two_sum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (null == nums && nums.length < 1 ) {
            throw new IllegalArgumentException("IllegalArgument");
        }
        /*
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] {i,j};
                }
            }
        }
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        int complement ;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
