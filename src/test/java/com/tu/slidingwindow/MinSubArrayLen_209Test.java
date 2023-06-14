package com.tu.slidingwindow;

import com.tu.arr.slidingwindow.MinSubArrayLen_209;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum/"> 209. 长度最小的子数组</a>
 */
public class MinSubArrayLen_209Test {

    @Test
    public void minSubArrayLen() {
        int[] nums = {2,3,1,2,4,3};
        int s = 7;
        int result = MinSubArrayLen_209.minSubArrayLen(s, nums);
        assertEquals(2, result);
    }

    @Test
    public void minSubArrayLen1() {
        int[] nums = {2,3,1,2,4,3};
        int s = 7;
        int result = MinSubArrayLen_209.minSubArrayLen1(s, nums);
        assertEquals(2, result);
    }


}