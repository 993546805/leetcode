package com.tu.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/fruit-into-baskets/">904. 水果成篮</a>
 *
 * @author tu
 * @date 2023-06-14 09:24
 */
public class TotalFruit_904 {


    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = Integer.MIN_VALUE;
        int subLength = 0;
        int left = 0;
        for (int i = 0; i < fruits.length; i++) {

            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            subLength = i - left + 1;
            result = Math.max(result, subLength);
        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }
}
