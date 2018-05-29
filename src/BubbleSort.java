/**
 * 冒泡法排序
 * 时间复杂度O(n²)
 * 比较相邻的两个数，如果第一个比第二个大，就交换两者
 * 这样一次循环后，最大的数就会冒泡到结尾
 * 针对所有的数进行一次重复以上步骤（除了最后一个数 ）
 * @param arr int[] 未经排序的数组
 * @return int[] 排序完成的数组
 */
public class BubbleSort{
    public static int[] sort(int[] arr) {
        int i, temp, len = arr.length;
        boolean changed;

        do {
            changed = false;
            len -= 1;
            for (i = 0; i < len; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1]  = temp;
                    changed = true;
                }
            }
        } while(changed);

        return arr;
    }
}
    