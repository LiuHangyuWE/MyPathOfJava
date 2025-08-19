public class Main {
    public static void main(String[] args) {
        //公司员工：带有继承结构的标准JavaBean类

        /*
        JavaBean 规范：
        提供无参构造方法
        属性使用 private 修饰
        提供 getter 和 setter 方法
        */

        // 创建不同类型的员工
        Employee lecturer = new Lecturer("E001", "John", "Teaching");
        Employee tutor = new Tutor("E002", "Alice", "Assisting");
        Employee maintainer = new Maintainer("E003", "Bob", "Maintenance");
        Employee buyer = new Buyer("E004", "Charlie", "Purchasing");

        // 调用 work 方法
        lecturer.work();
        tutor.work();
        maintainer.work();
        buyer.work();

    }
}