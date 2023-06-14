package com.tu.arr.binarysearch;

/**
 * <a href="https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/">剑指 Offer 53 - II. 0～n-1中缺失的数字</a>
 * @author tu
 * @date 2023-06-07 20:54
 */
public class MissingNumber_offer_53 {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int middle = left + ((right - left) >> 1);
            if(nums[middle] > middle){
                right = middle;
            }else {
                left = middle + 1;
            }
        }
        return left;
    }

}
