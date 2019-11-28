package com.algorithm.demo.remove_duplicates_from_sorted_array;


public class Solution {
    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 1;
        }

        int distinctedIndex = 0;
        int index = 1;
        while (nums.length > 1 && index < nums.length) {
            if (nums[index] != nums[index-1]) {
                nums[distinctedIndex+1] = nums[index];
                distinctedIndex++;
            }
            index++;
        }
        return distinctedIndex;
    }
}