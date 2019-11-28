package com.algorithm.demo.rotate_array;

class Solution {
    public void rotate(int[] nums, int k) {
        /*if (k < nums.length) {
            int[] temp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (i+k <= nums.length-1) {//往后挪
                    temp[i+k] = nums[i];
                }else{//往前挪
                    temp[i+k - (nums.length-1)] = nums[i];
                }
                //temp[(i+k) % nums.length] = nums[i];
            }
            for (int i = 0; i <nums.length ; i++) {
                nums[i] = temp[i];
            }
        }*/

        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i+k) % nums.length] = nums[i];
        }

        for (int i = 0; i <nums.length ; i++) {
            nums[i] = temp[i];
        }

    }
}
