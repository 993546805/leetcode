package com.tu.removeelement;

import com.tu.arr.removeelement.MoveZeroes_283;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroes_283Test {

    @Test
    public void moveZeroes() {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        MoveZeroes_283.moveZeroes(nums);
        assertArrayEquals(new int[]{4,2,4,3,5,1,0,0,0,0}, nums);
    }
}