/**
 * 二分查找
 */

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        // 数组必须是有序的
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = low + (low + high) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()) {
            // 读取数值，如果不在白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }
}
