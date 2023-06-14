package com.tu.arr.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/">350. 两个数组的交集 II</a>
 * @author tu
 * @date 2023-06-07 20:44
 */
public class Intersect_350 {

    /**
     * 暴力解法
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i++]);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 排序 + 双指针
     */
    public static int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int[] res = new int[nums1.length];
        int index = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else {
                res[index++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
