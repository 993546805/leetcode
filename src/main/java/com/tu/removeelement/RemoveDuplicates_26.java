package com.tu.removeelement;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">26. 删除有序数组中的重复项</a>
 *
 * @author tu
 * @date 2023-06-08 10:58
 */
public class RemoveDuplicates_26 {

    /**
     * 双指针
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
