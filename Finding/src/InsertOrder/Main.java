package InsertOrder;

public class Main {
    public static void main(String[] args) {
        int[] data = {49, 38, 65, 97, 76, 13, 27};
        System.out.println("原始数组:");
        printArray(data);

        sort(data);

        System.out.println("排序后的数组:");
        printArray(data);
    }

    public static void sort(int[] data) {
        if(data.length <= 1 || data == null) {
            return;
        }

        for (int i = 1; i < data.length; i++) {
            int key = data[i]; // 预排序元素
            int j = i - 1; // 已经排好的最后一个元素

            // 关键：不断寻找插入位置
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
