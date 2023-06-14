package com.tu.arr.slidingwindow;

/**
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum/">209. 长度最小的子数组</a>
 * @author tu
 * @date 2023-06-13 15:52
 */
public class MinSubArrayLen_209 {


    /**
     * 暴力破解 O(n^2)
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum >= target){
                    int subLength = j - i + 1;
                    minSize = minSize > subLength ? subLength : minSize;
                    break;
                }
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    /**
     * 双指针
     * 窗口就是 满足其和 ≥ target 的长度最小的 连续子数组。
     * 窗口的起始位置如何移动：如果当前窗口的值大于target了，窗口就要向前移动了（也就是该缩小了）。
     * 窗口的结束位置如何移动：窗口的结束位置就是遍历数组的指针，也就是for循环里的索引。
     */
    public static int minSubArrayLen1(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0; // 滑动窗口的和
        int i = 0;  // 滑动窗口的起始位置
        int subLength = 0; // 滑动窗口的长度
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            // 满足条件
            while (sum >= target) {
                // 不断更新结果
                subLength = j - i + 1;
                result = Math.min(result, subLength);
                // 窗口左下标右移
                sum -= nums[i];
                i++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
