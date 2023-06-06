package com.tu.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindKthPositive1539Test {


    /**
     * 用于测试:
     */
    @Test
    public void test() {
        int val = FindKthPositive1539.findKthPositive1(new int[]{2, 3, 4, 7, 11}, 5);
        int val1 = FindKthPositive1539.findKthPositive1(new int[]{1,2, 3, 4}, 2);
        assertEquals(9, val);
        assertEquals(6, val1);
    }



    /**
     * 用于测试:二分查找
     */
    @Test
    public void test_binarySearch() {
        int val = FindKthPositive1539.findKthPositive2(new int[]{2, 3, 4, 7, 11}, 5);
        int val1 = FindKthPositive1539.findKthPositive2(new int[]{1,2, 3, 4}, 2);
        assertEquals(9, val);
        assertEquals(6, val1);
    }

}