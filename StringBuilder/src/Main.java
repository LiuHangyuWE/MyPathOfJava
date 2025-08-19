public class Main {
    public static void main(String[] args) {
        //StringBuilder拼接和反转很快
        StringBuilder sb = new StringBuilder();
        //链式编程
        sb.append(1).append('c').append(1.5).append("AAA");
        System.out.println(sb);
        //StringBuilder类型转换为String类型后用字符串的方法
        System.out.println(sb.toString().length());
    }
}