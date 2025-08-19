package Question1;

import java.util.Scanner;

//小明要爬N个台阶,他有时候一次爬三个台阶,有时候一次爬两个台阶，有时候只爬一个台阶，问一共有多少种爬法。
public class Main {
    public static void main(String[] args) {
        System.out.println("输入台阶数量：");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("爬法： " + formula(N));
    }

    static int formula(int N) {
        if (N == 1)
            return 1;
        if (N == 2)
            return 2;
        if (N == 3)
            return 4;

        return formula(N - 1) + formula(N - 2) + formula(N - 3);
    }
}
