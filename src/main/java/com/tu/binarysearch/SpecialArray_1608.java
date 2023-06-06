package com.tu.binarysearch;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/special-array-with-x-elements-greater-than-or-equal-x/">1608. 特殊数组的特征值</a>
 *
 * @author tu
 * @date 2023-06-06 16:51
 */
public class SpecialArray_1608 {

    /**
     * 暴力破解(时间复杂度O(n^2))
     */
    public static int specialArray(int[] nums) {
        int val = nums.length;
        while (val > -1) {
            int count = 0;
            for (int num : nums) {
                if (num >= val) {
                    count++;
                }
            }
            if (count == val) {
                return val;
            }
            val--;
        }
        return -1;
    }

}


