package com.tu.binarysearch;

/**
 * <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">34. 在排序数组中查找元素的第一个和最后一个位置</a>
 *
 * @author tu
 * @date 2023-06-06 16:14
 */
public class SearchRange_34 {

    /**
     * 自己的二分法思想: 先找到target 左边界和右边界中的某个下标,然后再根据该下标循环找出左边界和右边界
     */
    public static int[] searchRange1(int[] nums, int target) {
        int leftIdx = 0, rightIdx = 0;
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle;
            } else {
                leftIdx = middle;
                rightIdx = middle;
                while (leftIdx > 0 && nums[leftIdx - 1] == target) {
                    leftIdx--;
                }
                while (rightIdx < nums.length - 1 && nums[rightIdx + 1] == target) {
                    rightIdx++;
                }
                return new int[]{leftIdx, rightIdx};
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * 官方的二分法思想: 找到 target 对应的最小下标, 再找到 target+1 的最小下班
     */
    public static int[] searchRange2(int[] nums, int target){
        int leftIndex = searchRange(nums, target);
        int rightIndex = searchRange(nums, target + 1) - 1;
        return new int[]{leftIndex, rightIndex};
    }

    private static int searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}