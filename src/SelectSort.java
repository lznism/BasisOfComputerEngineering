/**
 * 选择法排序
 * 时间复杂度O(n²)
 * 选择整个数组的最小值，插入到数组的最前面
 */

public class SelectSort {
    public static sort (int[] arr) {
        int i, j, min, temp, len = arr.length;

        for (i = 0; i < len - 1; i++) {
            min = i;
            for (j = i + 1; j < len; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }                
            }

            // 交换位置
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}