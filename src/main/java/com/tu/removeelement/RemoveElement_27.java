package com.tu.removeelement;

/**
 * <a href="https://leetcode-cn.com/problems/remove-element/">27. 移除元素</a>
 *
 * @author tu
 * @date 2023-06-08 10:21
 */
public class RemoveElement_27 {

    /**
     * 自己的思路: 从前往后遍历,如果当前元素等于 val,则找到最近一个不等于 val 的元素,将其与当前元素交换
     */
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                //如果当前元素等于 val,则跳过该轮循环
                continue;
            } else {
                // 如果当前元素不等于 val,则找到最近一个等于 val 的元素,将其与当前元素交换
                int index = i + 1;
                while (index < nums.length && nums[index] == val) {
                    index++;
                }
                if (index < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                } else {
                    // 如果当前元素不等于 val,且后面没有等于 val 的元素,则直接返回
                    return i;
                }
            }
        }
        return n;
    }

    /**
     * 双指针
     */
    public static int removeElement1(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    /**
     * 优化双指针,将不等于 val 的元素移动到数组的左侧,等于 val 的元素移动到数组的右侧
     */
    public static int removeElement2(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
