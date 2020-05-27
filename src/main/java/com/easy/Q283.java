package com.easy;

public class Q283 {

    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!= 0) {
                nums[lastNonZeroIndex++] = nums[i];
            }
        }
        for (;lastNonZeroIndex< nums.length;lastNonZeroIndex++) {
            nums[lastNonZeroIndex] = 0;
        }
    }
}
