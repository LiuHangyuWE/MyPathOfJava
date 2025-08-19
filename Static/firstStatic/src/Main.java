public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("icediao", 23, "BoyStraight");
        Student s2 = new Student("water", 24, "BoyStraight");

        //推荐的调用方式如下，静态变量被所有对象共享
        Student.teachar = "watermelon";
        s1.study();
        s2.study();
        s1.ShowMessage();
        s2.ShowMessage();

    }
}