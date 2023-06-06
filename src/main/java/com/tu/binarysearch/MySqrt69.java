package com.tu.binarysearch;

/**
 * <a href="https://leetcode.cn/problems/sqrtx/">69. x的平方根</a>
 * @author tu
 * @date 2023-06-06 16:28
 */
public class MySqrt69 {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        while(left <= right){
            int middle = left + ((right - left ) >> 1);
            if((long)middle * middle > x){
                right = middle - 1;
            }else if ((long)middle * middle < x) {
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return right;
    }
}
