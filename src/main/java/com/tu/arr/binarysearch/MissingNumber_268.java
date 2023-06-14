package com.tu.arr.binarysearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/missing-number/">268. 缺失数字</a>
 * @author tu
 * @date 2023-06-06 17:12
 */
public class MissingNumber_268 {

    /**
     * 将数组中的元素放入map中，然后遍历0~n，如果map中不包含该元素，则返回该元素
     */
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,1);
        }
        for(int i = 0; i <= size; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 数学方法: 0~n的和减去数组中元素的和，即为缺失的元素
     */
    public static int missingNumber1(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        return (size * (size + 1)) / 2 - sum;
    }

    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] > middle) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
