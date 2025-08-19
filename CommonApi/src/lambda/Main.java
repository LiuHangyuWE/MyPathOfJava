package lambda;


import java.util.Arrays;

//利用lambda表达式简写sort的匿名内部类
public class Main {
    public static void main(String[] args) {
        String[] arr = {"aa", "aaaa", "aaa", "a"};

        Arrays.sort(arr, ((o1, o2) -> o2.length() - o1.length()));

        System.out.println(Arrays.toString(arr));
    }
}
