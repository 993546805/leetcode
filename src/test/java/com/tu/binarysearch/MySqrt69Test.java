package com.tu.binarysearch;

import com.tu.arr.binarysearch.MySqrt_69;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySqrt69Test {

    @Test
    public void mySqrt() {
        int val = MySqrt_69.mySqrt(2147395599);
        assertEquals(46339, val);
    }
}