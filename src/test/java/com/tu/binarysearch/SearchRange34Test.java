package com.tu.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchRange34Test {

    @Test
    public void searchRange1() {
        int[] ints = SearchRange_34.searchRange1(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertArrayEquals(new int[]{3, 4}, ints);
    }

    @Test
    public void searchRange2() {
        int[] ints = SearchRange_34.searchRange2(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertArrayEquals(new int[]{3, 4}, ints);
    }
}