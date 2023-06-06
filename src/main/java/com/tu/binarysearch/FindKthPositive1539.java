package com.tu.binarysearch;

/**
 * <a href="https://leetcode-cn.com/problems/kth-missing-positive-number/">1539. 第 k 个缺失的正整数</a>
 * @author tu
 * @date 2023-06-06 14:49
 */
public class FindKthPositive1539 {

    public static int findKthPositive(int[] arr, int k) {
        int missCount = 0, lassMiss = -1, current = 1, ptr = 0;
        for(;missCount < k; current++){
            if(current == arr[ptr]) {
                ptr = (ptr + 1 < arr.length) ? ptr + 1 : ptr;
            }else{
                missCount++;
                lassMiss = current;
            }
        }
        return lassMiss;
    }


    public static int findKthPositive1(int[] arr, int k) {
        int missCount = 0, lassMiss = -1, current = 1, ptr = 0;

        // 当缺失的数小于k时, 且指针未超过数组长度,继续循环
        while( missCount < k && ptr < arr.length){
            if(current == arr[ptr]) {
                // 数组中的数不缺失,指针后移
                ptr++;
            }else{
                // 数组中的数缺失,计数器加一
                missCount++;
                // 记录最后一个缺失的数
                lassMiss = current;
            }
            // 当前数加一
            current++;
        }
        return missCount < k ? current + k - missCount - 1 : lassMiss;

    }

    /**
     * 二分法的思路是找到第一个大于等于 k 的位置，然后返回该位置加上 k - 1 的值。
     */
    public static int findKthPositive2(int[] arr, int k) {
        int left = 0;
        int right = arr.length;
        while(left < right) {
            int middle = (right + left ) / 2;
            // 当前位置的数减去当前位置减一,如果小于k,说明缺失的数在右边
            if(arr[middle] - middle - 1 < k) {
                left = middle + 1;
            }else {
                right = middle;
            }
        }
        // 最后返回的是left,因为left是第一个大于等于k的位置
        return left + k;
    }


}
