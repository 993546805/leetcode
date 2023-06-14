package com.tu.hash;

import com.tu.arr.hash.EqualPairs2352;
import org.junit.Assert;
import org.junit.Test;

public class EqualPairs2352Test {

    @Test
    public void equalPairs() {
        Assert.assertEquals(3, new EqualPairs2352().equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
        Assert.assertEquals(3, new EqualPairs2352().equalPairs1(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));

    }
}