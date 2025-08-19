import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("001", "ray", 18);
        arr[1] = new Student("heima002", "whs", 17);
        arr[2] = new Student("003", "ech", 19);

        Scanner scan = new Scanner(System.in);

        Student stu;
        boolean isValid = true;
        System.out.println("录入新学生的ID：");
        String s = scan.next();


        for (int i = 0; i < arr.length; i++) {
            if (s.equals(arr[i].getName())) {
                isValid = false;
                break;
            }
        }

        if (!isValid) {
            System.out.println("ID冲突");
            return;
        } else {
            System.out.println("录入学生的名字：");
            String sName = scan.next();
            System.out.println("录入学生的年龄：");
            int age = scan.nextInt();
            stu = new Student(s, sName, age);
        }

        Student[] newArr = Arrays.copyOf(arr, 4);
        newArr[3] = stu;

        System.out.println("学生信息如下：");
        for (Student p : newArr) {
            System.out.println("ID:" + p.getId() + " Name:" +p.getName() + " Age:" +p.getAge());
        }

        System.out.println("输入删除学生的信息：");
        String deleteID = scan.next();

        boolean isDelete = false;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i].getId().equals(deleteID)) {
                for (int j = i; j < newArr.length - 1; j++) {
                    newArr[j] = newArr[j + 1];
                }
                System.out.println("删除成功");
                isDelete = true;
                break;
            }
        }
        if (!isDelete) {
            System.out.println("无此学生");
        }
        arr = Arrays.copyOf(newArr, 3);

        System.out.println("删除后的学生信息：");
        for (Student p : arr) {
            System.out.println("ID:" + p.getId() + " Name:" +p.getName() + " Age:" +p.getAge());
        }

        boolean isStudent = false;
        int isNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals("heima002")) {
                arr[i].setAge(arr[i].getAge() + 1);
                isStudent = true;
                isNum = i;
                break;
            }
        }

        if (isStudent) {
            System.out.println();
            System.out.println("heima002的年龄：" + arr[isNum].getAge());
        }

    }
}
