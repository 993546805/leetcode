package com.tu.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class Intersection_349Test {

    @Test
    public void intersection() {
        int[] nums1 = {1,3,8,9,3};
        int[] nums2 = {1,0};
        int[] res = Intersection_349.intersection(nums1, nums2);
        assertArrayEquals(new int[]{1},res);
    }
}