package com.tu.removeelement;

import com.tu.arr.removeelement.BackspaceCompare_844;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceCompare_844Test {

    @Test
    public void backspaceCompare() {
        String s = "ab#c";
        String t = "ad#c";
        boolean result = BackspaceCompare_844.backspaceCompare(s, t);
        assertTrue(result);
    }

}