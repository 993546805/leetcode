package com.tu.arr.removeelement;

/**
 * <a href="https://leetcode-cn.com/problems/squares-of-a-sorted-array/">977. 有序数组的平方</a>
 *
 * @author tu
 * @date 2023-06-12 09:30
 */
public class SortedSquares_977 {

    /**
     * 双指针
     */
    public static int[] sortedSquares5(int[] nums) {
        int[] res = new int[nums.length];
        int index = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];
            if (leftVal < rightVal) {
                res[index--] = rightVal;
                right--;
            } else {
                res[index--] = leftVal;
                left++;
            }
        }
        return res;
    }

    /**
     * 插入排序
     */
    public static int[] sortedSquares(int[] nums) {
        nums[0] = nums[0] * nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i] * nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
        return nums;
    }

    /**
     * 冒泡排序
     */
    public static int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                        int temp = nums[j + 1];
//                        nums[j + 1] = nums[j];
//                        nums[j] = temp;
//                }
//            }
//        }
        // 冒泡排序算法动画演示效果代码
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * 选择排序
     */
    public static int[] sortedSquares2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }

    /**
     * 归并排序
     */
    public static int[] sortedSquares3(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int n = nums.length;
        if (n <= 1) {
            return nums;
        }
        int[] temp = new int[n];
        mergeSort(nums, 0, n - 1, temp);
        return nums;
    }

    /**
     * 快速排序
     */
    public static int[] sortedSquares4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        return quickSort(nums, 0, nums.length - 1);
    }

    private static int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int p = partition(nums, left, right);
            quickSort(nums, left, p);
            quickSort(nums, p + 1, right);
        }
        return nums;
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = left;
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (nums[i] < nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        int temp = nums[pivot];
        nums[pivot] = nums[index - 1];
        nums[index - 1] = temp;
        return index - 1;
    }


    private static void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + ((right - left) >> 1);
            mergeSort(nums, left, mid, temp);
            mergeSort(nums, mid + 1, right, temp);
            merge(nums, left, mid, right, temp);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        k = 0;
        for (int m = left; m <= right; m++) {
            nums[m] = temp[k++];
        }
    }
}
