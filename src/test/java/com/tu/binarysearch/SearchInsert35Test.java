package com.tu.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsert35Test {

    @Test
    public void searchInsert() {
        // 左闭右开
        int index = SearchInsert35.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, index);
    }


    @Test
    public void searchInsert1() {
        // 左闭右闭
        int index = SearchInsert35.searchInsert1(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, index);
    }
}