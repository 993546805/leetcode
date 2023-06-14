package com.tu.removeelement;

import com.tu.arr.removeelement.RemoveDuplicates_26;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicates_26Test {

    @Test
    public void removeDuplicates() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = RemoveDuplicates_26.removeDuplicates(nums);
        assertEquals(5, result);
    }
}