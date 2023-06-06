package com.tu.binarysearch;

/**
 * <a href="https://leetcode-cn.com/problems/valid-perfect-square/">367. 有效的完全平方数</a>
 *
 * @author tu
 * @date 2023-06-06 16:35
 */
public class IsPerfectSquare_367 {
    /**
     * 二分查找
     */
    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if ((long) middle * middle == num) {
                return true;
            } else if ((long) middle * middle > num) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}
