package com.tu.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/** 
* Search704 Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 6, 2023</pre> 
* @version 1.0 
*/ 
public class Search704Test { 


    /**
    *
    * Method: search(int[] nums, int target)
    *
    */
    @Test
    public void testSearch() throws Exception {
        Assert.assertEquals(4, Search704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));        Assert.assertEquals(4, Search704.search(new int[]{-1,0,3,5,9,12}, 9));
        Assert.assertEquals(1, Search704.search(new int[]{2,5}, 5));

    }

    /**
     *
     * Method: search1(int[] nums, int target)
     *
     */
    @Test
    public void testSearch1() throws Exception {
        Assert.assertEquals(4, Search704.search1(new int[]{-1, 0, 3, 5, 9, 12}, 9));        Assert.assertEquals(4, Search704.search(new int[]{-1,0,3,5,9,12}, 9));
        Assert.assertEquals(1, Search704.search1(new int[]{2,5}, 5));

    }


} 
