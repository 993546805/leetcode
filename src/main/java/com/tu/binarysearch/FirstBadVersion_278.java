package com.tu.binarysearch;

/**
 * <a href="https://leetcode-cn.com/problems/first-bad-version/">278. 第一个错误的版本</a>
 *
 * @author tu
 * @date 2023-06-06 17:28
 */
public class FirstBadVersion_278 {
    public static int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while(left <= right){
            int middle = left + ((right-left)/2);
            if(isBadVersion(middle)){
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return right + 1;
    }

    private static boolean isBadVersion(int middle) {
        return false;
    }
}
