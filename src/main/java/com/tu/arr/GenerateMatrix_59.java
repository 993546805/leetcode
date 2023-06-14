package com.tu.arr;

/**
 * <a href="https://leetcode-cn.com/problems/spiral-matrix-ii/">59. 螺旋矩阵 II</a>
 *
 * @author tu
 * @date 2023-06-14 10:26
 */
public class GenerateMatrix_59 {

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int loop = 0; //控制循环次数
        int start = 0; //每次循环开始点(start,start)
        int count = 1; //每次填充的值
        int i, j;
        while (loop < n / 2) {
            loop++;
            // 模拟从上的左侧到右侧
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            // 模拟从右的上侧到下侧
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            // 模拟从下的右侧到左侧
            for (j = j; j >= loop; j--) {
                res[i][j] = count++;
            }

            // 模拟从左的下到上
            for (i = i; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }
        if (n % 2 == 1) {
            res[start][start] = count;
        }

        return res;
    }
}
