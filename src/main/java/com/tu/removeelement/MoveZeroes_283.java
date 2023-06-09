package com.tu.removeelement;

/**
 * <a href="https://leetcode-cn.com/problems/move-zeroes/">283. 移动零</a>
 * @author tu
 * @date 2023-06-08 11:31
 */
public class MoveZeroes_283 {

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        while(count < nums.length){
            nums[count++] = 0;
        }
    }

    public static void moveZeros(int[] nums){
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if(nums[q] != 0){
                if(q > p){
                    nums[p] = nums[q];
                    nums[q] = 0;
                }
                p++;
            }
            q++;
        }
    }
}
