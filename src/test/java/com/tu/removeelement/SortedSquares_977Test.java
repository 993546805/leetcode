package com.tu.removeelement;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * <a href="https://leetcode-cn.com/problems/squares-of-a-sorted-array/">977. 有序数组的平方</a>
 */
public class SortedSquares_977Test {


    static int[] nums = new int[1000000];

    static {
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
        }
    }


    @Test
    public void sortedSquares() {
        int[] numss = Arrays.copyOfRange(nums, 0, nums.length);
        int[] result = SortedSquares_977.sortedSquares(numss);
    }


    @Test
    public void sortedSquares1() {
        int[] numss = Arrays.copyOfRange(nums, 0, nums.length);
        int[] result = SortedSquares_977.sortedSquares1(numss);
    }


    @Test
    public void sortedSquares2() {
        int[] numss = Arrays.copyOfRange(nums, 0, nums.length);
        int[] result = SortedSquares_977.sortedSquares2(numss);
    }

    @Test
    public void sortedSquares3() {
        int[] numss = Arrays.copyOfRange(nums, 0, nums.length);
        int[] result = SortedSquares_977.sortedSquares3(numss);
    }

    @Test
    public void sortedSquares4() {
        int[] numss = Arrays.copyOfRange(nums, 0, nums.length);
        int[] result = SortedSquares_977.sortedSquares4(numss);
    }

    @Test
    public void sortedSquares5() {
        int[] numss = Arrays.copyOfRange(nums, 0, nums.length);
        int[] result = SortedSquares_977.sortedSquares5(numss);
    }
}