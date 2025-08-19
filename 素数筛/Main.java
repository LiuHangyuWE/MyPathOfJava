import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想筛选的素数闭区间，其中，左范围默认为0：");
        int right = sc.nextInt();

        if (right <= 1) {
            System.out.println("No such a number.");
            return;
        }

        boolean[] chooseArray = new boolean[right - 1];

        // 初始默认全部值均为false，设false为素数，true为合数来筛选
        for (int i = 2; i <= right; i++) {
            // 注意边界，简化时加到数组边界就该停止了
            while (chooseArray[i - 2] && i < right)    i++;

            for (int j = i + 1; j <= right; j++) {
                if (j % i == 0)    chooseArray[j - 2] = true;
            }
        }

        int number = 0;
        for (int i = 2; i <= right; i++) {
            if (!chooseArray[i - 2]) {
                //采用printf来用占位符对齐
                System.out.printf("%5d ", i);
                number++;
                if (number % 10 == 0)
                    System.out.println();
            }
        }
    }
}
