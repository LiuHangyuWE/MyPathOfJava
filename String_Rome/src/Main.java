import java.util.Scanner;

public class Main {

    /*
    键盘录入字符串，只能是数字，转换为罗马数字
    整个程序功能是转换为罗马数字，应包装在一个类中
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();

        boolean isValid = checkValid(s);
        if (!isValid) {
            return;
        }

        String result = numToRome(s);
        System.out.println(result);
    }

    public static boolean checkValid (String s) {
        //长度不能大于9
        if (s.length() > 9) {
            System.out.println("长度不合法");
            return false;
        }
        //输入必须为数字
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                System.out.println("输入类型不合法");
                return false;
            }
        }

        return true;
    }

    public static String numToRome (String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(hashHome(s.charAt(i) - '0')).append(' ');
        }
        return sb.toString();
    }

    public static String hashHome (int num) {
        //此处的映射可以改为switch语句
        String[] s = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII","IX"};
        return s[num];
    }
}