package com.tu.arr.binarysearch;

/**
 * <a href="https://leetcode-cn.com/problems/search-insert-position/">35. 搜索插入位置</a>
 * @author tu
 * @date 2023-06-06 15:50
 */
public class SearchInsert_35 {

    /**
     * 左闭右开
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int middle = left + (right - left) >> 1;
            if(nums[middle] < target) {
                left = middle + 1;
            }else if (nums[middle] > target) {
                right = middle;
            }else {
                return middle;
            }
        }
        return right;
    }

    /**
     * 左闭右闭
     */
    public static int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = left + ((right - left) >> 1);
            if(nums[middle] < target) {
                left = middle + 1;
            }else if (nums[middle] > target) {
                right = middle - 1;
            }else {
                return middle;
            }
        }
        return right + 1;
    }


}
