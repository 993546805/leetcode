package com.tu.binarysearch;

import com.tu.arr.binarysearch.MissingNumber_268;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumber_268Test {

    @Test
    public void missingNumber() {
        int val = MissingNumber_268.missingNumber(new int[]{3, 0, 1});
        assertEquals(2,val);
    }

    @Test
    public void missingNumber1() {
        int val = MissingNumber_268.missingNumber1(new int[]{3, 0, 1});
        assertEquals(2,val);
    }

    @Test
    public void missingNumber2() {
        int val = MissingNumber_268.missingNumber2(new int[]{3, 0, 1});
        assertEquals(2,val);
    }
}