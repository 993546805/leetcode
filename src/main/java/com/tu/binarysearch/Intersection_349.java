package com.tu.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays/">349. 两个数组的交集</a>
 * @author tu
 * @date 2023-06-07 18:09
 */
public class Intersection_349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersection(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        int current = -1;
        for(int i = 0 ; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] < nums2[j]){
                    continue;
                }else if(nums1[i] == nums2[j] && nums2[j] != current){
                    res.add(nums2[j]);
                    current = nums2[j];
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
