public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}