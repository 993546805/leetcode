package com.tu.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPerfectSquare367Test {

    @Test
    public void isPerfectSquare() {
        boolean perfectSquare = IsPerfectSquare_367.isPerfectSquare(2147483647);
        assertFalse(perfectSquare);

        perfectSquare = IsPerfectSquare_367.isPerfectSquare(2147395600);
        assertTrue(perfectSquare);
    }
}