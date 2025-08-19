package QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27};
        System.out.println(Arrays.toString(arr));

        quickUtil(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        //快速排序也可以调包：Arrays.sort(array);
    }

    public static void quickUtil(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = quickSort(arr, start, end);
        quickUtil(arr, start, pivot - 1);
        quickUtil(arr, pivot + 1, end);
    }

    public static int quickSort(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        while (start != end) {
            //优先end行走，保证汇合时end处于小于pivot的位置，可与pivot互换
            while (end > start && arr[end] >= pivot) {
                end--;
            }

            while (start < end && arr[start] <= pivot) {
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        return start;
    }
}
