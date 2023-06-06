package com.tu.binarysearch;


/**
 * @author tu
 * @date 2023-06-05 14:40
 */
public class Search704 {

    /**
     * 左闭右开
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int middle = (right + left ) / 2;
            if(nums[middle] > target) {
                right = middle;
            }else if(nums[middle] < target){
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 左闭右闭
     */
    public static int search1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int middle = (right + left ) / 2;
            if(nums[middle] > target) {
                right = middle - 1;
            }else if(nums[middle] < target){
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }

}
