import java.util.Scanner;
/*
public class Main {

    //和谐或私密数据

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //号码私密
        System.out.println("输入电话号码：");
        String cellNumber = scanner.next();
        System.out.println("私密后的号码：");
        System.out.println(cellNumber.substring(0, 3) + "****" + cellNumber.substring(7));

        //替换原有字符串
        System.out.println("输入你的评论：");
        String commment = scanner.next();
        System.out.println("评论最终显示为：");
        System.out.println(commment.replace("TMD", "***"));
    }
}

 */

public class Main {

    //判断两个字符串能否移动到互换

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("不合法");
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.equals(s2)) {
                System.out.println("合法");
                return;
            }
            s1 = move(s1);
        }

        System.out.println("不合法");
    }

    public static String move(String s) {
        return s.substring(1) + s.charAt(0);
    }
}