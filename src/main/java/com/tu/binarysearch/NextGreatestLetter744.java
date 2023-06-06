package com.tu.binarysearch;

/**
 * <a href="https://leetcode.cn/problems/find-smallest-letter-greater-than-target/">744. 寻找比目标字母大的最小字母</a>
 *
 * @author tu
 * @date 2023-06-05 14:00
 */
public class NextGreatestLetter744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        // 如果 target 大于 letters 中的所有元素,那么返回 letters[0]
        if (target >= letters[right]) {
            return letters[0];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return letters[left];
    }
}
