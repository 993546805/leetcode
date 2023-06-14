package com.tu.removeelement;

import com.tu.arr.removeelement.RemoveElement_27;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElement_27Test {

    @Test
    public void removeElement() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = RemoveElement_27.removeElement(nums, val);
        assertEquals(2, result);
    }

    @Test
    public void removeElement1() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = RemoveElement_27.removeElement1(nums, val);
        assertEquals(2, result);
    }

    @Test
    public void removeElement2() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = RemoveElement_27.removeElement2(nums, val);
        assertEquals(2, result);
    }
}