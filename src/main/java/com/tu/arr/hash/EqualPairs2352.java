package com.tu.arr.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * <a href="https://leetcode.cn/problems/equal-row-and-column-pairs//">2352. 相等行列对</a>
 * @author tu
 * @date 2023-06-06 10:57
 */
public class EqualPairs2352 {

    /**
     * O(n^3)
     */
    public int equalPairs(int[][] grid) {
        int res = 0;
        int n = grid.length;
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++) {
                if(equals(row,col,grid)) {
                    res++;
                }
            }
        }
        return res;
    }

    public int equalPairs1(int[][] grid){
        Map<List<Integer>,Integer> map = new HashMap<>();
        for (int[] row : grid){
            List<Integer> arr = new ArrayList<>();
            for(int val : row){
                arr.add(val);
            }
            map.put(arr,map.getOrDefault(arr,0) + 1);
        }
        int res = 0;
        for (int j = 0; j < grid.length; j++) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                arr.add(grid[i][j]);
            }
            if (map.containsKey(arr)) {
                res += map.get(arr);
            }
        }
        return res;
    }

    public boolean equals(int row,int col,int[][] grid){
        for(int i = 0; i < grid.length; i++){
            if(grid[row][i] != grid[i][col]){
                return false;
            }
        }
        return true;
    }
}
