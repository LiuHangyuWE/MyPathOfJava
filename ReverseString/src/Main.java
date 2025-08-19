import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入罗马数字金额：");
        String s = sc.next();

        String result = reverse(s);
        System.out.print("反转后为： ");
        System.out.println(result);

        if (s.charAt(0) == '-' || s.length() > 7) {
            System.out.println("金额无效");
            return;
        }
        System.out.println("大写金额：");
        SToCapital cp = new SToCapital();
        //转换并输出
        cp.ConvertToCapital(s);
    }

    public static String reverse(String s) {
        String result = new String();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            result += ch;
        }

        return result;
    }
}